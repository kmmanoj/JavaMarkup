package javamarkup.semanticanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.syntaxanalyser.Mapper;
import java.util.*;
import java.io.*;

public class SemanticAnalyser{
	public static DOM analyse(File sourcecode){
		// retrieve the symbol table
		ArrayList<SymbolRecord> symbolTable = new ArrayList<>();
		BufferedReader buf;
		try{
			buf = new BufferedReader(new FileReader(sourcecode.getName().split("[.]")[0]+".symboltable.jm"));
			String line = null;
			while((line = buf.readLine())!=null){
				String[] words = line.split(" ");
				String value = "";
				for(int i=1;i<words.length-1;i++)
					value+=words[i];
				symbolTable.add(new SymbolRecord(Integer.parseInt(words[0]), value, Mapper.getType(words[words.length-1])));
			} 
			Semantics sem = new Semantics(symbolTable);
			return sem.analyse();
		}catch(IOException e){
			System.out.println("error");
			return null;
		}
	}
}