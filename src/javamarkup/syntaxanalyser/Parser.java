package javamarkup.syntaxanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.lexicalanalyser.Type;
import java.util.*;

public class Parser{
	ArrayList<String> terminals;
	ArrayList<String> nonTerminals;
	Stack<String> stack;

	public int parse(String input, ArrayList<SymbolRecord> symbolTable){
		int errors = 0;
		PredictiveParsingTable predictiveParsingTable = new PredictiveParsingTable();
		String[] t = {"t","s",".","i","#","(",")","a","=",",","{","}","$"};
		terminals = new ArrayList<>(Arrays.asList(t));
		String[] nt = {"S","X","P","C","D","A","L","M","H","I"};
		nonTerminals = new ArrayList<>(Arrays.asList(nt));

		stack = new Stack<>();
		stack.push("$");
		stack.push("S");

		int i = 0;
		while(i<input.length()){
			String derived = predictiveParsingTable.M(stack.peek(),Character.toString(input.charAt(i)));
			if(derived==null){
				if(i==input.length()-1){ i++; continue; }
				ErrorReport e = new ErrorReport(stack, input, symbolTable, i);
				stack = e.stack;
				i = e.i;
				errors++;
				continue;
			}
			String pop = stack.pop();
			for(int j=0;j<derived.length();j++)
				stack.push(Character.toString(derived.charAt(j)));
			System.err.println("derived "+derived+" from "+pop+" and stack is : "+stack+" while input is "+input.substring(i));
			while(i<input.length() && stack.peek().equals(Character.toString(input.charAt(i)))){
				i++;
				stack.pop();
			}
			System.err.println("In the end the stack is : "+stack);
		}
		if(!stack.isEmpty()){
			System.out.println("------ERROR---------");
			System.out.println("The input program ended incompletely");
			errors++;
		}
		return errors;
	}
}