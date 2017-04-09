package javamarkup;

import java.io.*;
import javamarkup.lexicalanalyser.LexicalAnalyser;

class Compiler{
	// TO CODE methods that are available to javamarkup.Main as an API for parsing javamarkup programs into html files
	public static void compile(File sourceCode){
		int ret = LexicalAnalyser.analyse(sourceCode);
		if(ret != 0){
			System.err.println("Error while occured while performing Lexical Analysis");
			return;
		}
		System.out.println(sourceCode);
	}
}