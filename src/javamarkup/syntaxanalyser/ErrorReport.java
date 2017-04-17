package javamarkup.syntaxanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.lexicalanalyser.Type;
import java.util.*;

public class ErrorReport{
	public Stack<String> stack;
	public String input;
	public ArrayList<SymbolRecord> symbolTable;
	public int i;

	public ErrorReport(Stack<String> stack, String input, ArrayList<SymbolRecord> symbolTable, int i){
		this.stack = stack;
		this.input = input;
		this.symbolTable = symbolTable;
		this.i = i;
		this.report();
		this.handle();
	}

	private void handle(){
		while(!this.stack.isEmpty() && !this.stack.peek().equals("X") && !this.stack.peek().equals("$")) this.stack.pop();
		while(this.i<this.input.length() && this.input.charAt(this.i) != 't') this.i++;
	}

	private void printContext(){
		int n = this.input.length()-1;
		if(this.i>=2 && this.i<=n-3){
			System.out.print("... ");
			System.out.print(symbolTable.get(i-2).value+" ");
			System.out.print(symbolTable.get(i-1).value+" ");
			System.out.print("<"+symbolTable.get(i).value+"> ");
			System.out.print(symbolTable.get(i+1).value+" ");
			System.out.print(symbolTable.get(i+2).value+" ...");
			System.out.println();
		} else if(this.i<2){
			if(this.i==1) System.out.print(symbolTable.get(this.i-1).value+" ");
			System.out.print("<"+symbolTable.get(this.i).value+"> ");
			if(this.i+1<n) System.out.print(symbolTable.get(this.i+1).value+" ");
			if(this.i+2<n) System.out.print(symbolTable.get(this.i+2).value+" ...");
			System.out.println();
		} else {
			System.out.print("... ");
			System.out.print(symbolTable.get(i-2).value+" ");
			System.out.print(symbolTable.get(i-1).value+" ");
			System.out.print("<"+symbolTable.get(i).value+"> ");
			if(this.i+1<n) System.out.print(symbolTable.get(i+1).value+" ");
			System.out.println();
		} 
	}

	private void report(){
		System.out.println("------ERROR---------");
		if(i<this.input.length()){
			String errorSymbol = Character.toString(this.input.charAt(i));
			String errorType = Mapper.getMappedType(errorSymbol);
			if(errorType==null)
				System.out.println("Unexpected symbol \'"+this.input.charAt(i)+"\'");
			else 
				System.out.println("Unexpected \'"+errorType+"\' found");
		}
		else System.out.println("html tag is already closed, hanging DOM element");
		printContext();
		System.out.println(this.stack+" "+input.substring(i-1));
		System.out.println();
	}
}