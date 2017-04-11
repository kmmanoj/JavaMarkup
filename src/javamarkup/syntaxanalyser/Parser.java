package javamarkup.syntaxanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.lexicalanalyser.Type;
import java.util.*;

public class Parser{
	static ArrayList<String> terminals;
	static ArrayList<String> nonTerminals;
	static Stack<String> stack;

	public static ArrayList<String> parse(String input, ArrayList<SymbolRecord> symbolTable){
		ArrayList<String> errors = new ArrayList<>();
		PredictiveParsingTable.initTable();
		String[] t = {"t","s",".","i","#","(",")","a","=",",","{","}","$"};
		terminals = new ArrayList<>(Arrays.asList(t));
		String[] nt = {"S","X","P","C","D","A","L","M","H","I"};
		nonTerminals = new ArrayList<>(Arrays.asList(nt));

		stack = new Stack<>();
		stack.push("$");
		stack.push("S");

		int i = 0;
		while(i<input.length()){
			String derived = PredictiveParsingTable.M(stack.peek(),Character.toString(input.charAt(i)));
			if(derived==null){
				ErrorReport e = new ErrorReport(stack, input, symbolTable, i);
				stack = e.stack;
				i = e.i;
				continue;
			}
			String pop = stack.pop();
			for(int j=0;j<derived.length();j++)
				stack.push(Character.toString(derived.charAt(j)));
			System.out.println("derived "+derived+" from "+pop+" and stack is : "+stack+" while input is "+input.substring(i));
			while(i<input.length() && stack.peek().equals(Character.toString(input.charAt(i)))){
				i++;
				stack.pop();
			}
			System.out.println("In the end the stack is : "+stack);
		}
		return errors;
	}
}