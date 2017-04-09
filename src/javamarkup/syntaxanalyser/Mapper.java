package javamarkup.syntaxanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.lexicalanalyser.Type;
import java.util.*;

public class Mapper{
	public static Type getType(String type){
		switch(type){
			case "delimiter": return Type.DELIMITER;
			case "keyword" : return Type.KEYWORD;
			case "tag" : return Type.TAG;
			case "attribute" : return Type.ATTRIBUTE;
			case "identifier" : return Type.IDENTIFIER;
			case "string" : return Type.STRING;
			case "symbol" : return Type.SYMBOL;
			case "number" : return Type.NUMBER;
			default : return Type.IDENTIFIER;
		}
	}
	public static String getMappedToken(SymbolRecord rec){
		switch(rec.type.getValue()){
			case 2 : return "t";
			case 6 : return rec.value;
			case 3 : return "a";
			case 5 : return "s";
			case 4 : return "i";
			default : return "";
		}
	}
	public static String generateInputString(ArrayList<SymbolRecord> symbolTable){
		String input = "";
		for(SymbolRecord s : symbolTable)
			input += getMappedToken(s);
		input += "$";
		return input;
	}
}