package javamarkup.lexicalanalyser;

import java.util.*;
import java.io.*;

class Tokenizer{
	private static ArrayList<SymbolRecord> SymbolTable = new ArrayList<>();
	public static void tokenize(File inputFile) throws IOException{
		FileInputStream f = new FileInputStream(inputFile);
        TransitionDiagram td = TransitionDiagram.getTransitionDiagram();
		String lexeme = "";
		char character='\0';
		int c=0;
		State tmp = td.getRoot();
		ArrayList<Character> delimiters = new ArrayList<>();
		delimiters.add('\0');
		delimiters.add('\n');
		delimiters.add('\r');
		delimiters.add(' ');
		int tc = 0;
		while(true){
			while(tmp!=null && !tmp.isToken() && f.available() > 0){
				c = f.read();
				character = (char)c;
				tmp = td.move(tmp, character);
				if(tmp != td.getRoot())
					lexeme += character;
			}
			if(tmp.isToken()) {
				// some patch up work
				while(delimiters.contains(lexeme.charAt(lexeme.length()-1)))
					lexeme = lexeme.substring(0, lexeme.length()-1);
				// end patch
				if(tmp.shouldRetract()){
					lexeme = lexeme.substring(0, lexeme.length()-1);
					SymbolTable.add(new SymbolRecord(tc++, lexeme, tmp.getType()));

					tmp = td.getRoot();
					lexeme = Character.toString(character);
					tmp = td.move(tmp, character);
				} else {
					SymbolTable.add(new SymbolRecord(tc++, lexeme, tmp.getType()));
					tmp = td.getRoot();
					lexeme = "";
				}
			} else if(f.available() <= 0) {
				break;
			}
		}

		// write into the file

		String path = inputFile.getParent();
		String fileName =inputFile.getName().split("[.]")[0];
		File outputFile = new File(path+"/"+fileName+".symboltable.jm");
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		if(!outputFile.exists())
			outputFile.createNewFile();

		for(SymbolRecord s : SymbolTable)
			writer.write(s+"\n");
		writer.close();
	}
}