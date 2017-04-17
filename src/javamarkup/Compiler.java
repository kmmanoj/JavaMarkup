package javamarkup;

import java.io.*;
import javamarkup.lexicalanalyser.LexicalAnalyser;
import javamarkup.syntaxanalyser.SyntaxAnalyser;
import javamarkup.semanticanalyser.SemanticAnalyser;
import javamarkup.semanticanalyser.DOM;
import javamarkup.codegenerator.CodeGenerator;

class Compiler{
	// TO CODE methods that are available to javamarkup.Main as an API for parsing javamarkup programs into html files
	public static String compile(File sourceCode) {
		int ret = LexicalAnalyser.analyse(sourceCode);
		if(ret != 0){
			System.err.println("Error while occured while performing Lexical Analysis");
			return "<error>ERROR DURING LEXICAL ANALYSIS</error>";
		}
		int errorCount = SyntaxAnalyser.analyse(sourceCode);
		if(errorCount!=0){
			System.out.println("--- COMPILE TIME ERROR; PARSING TERMINATED ---");
			System.exit(1);
		}
		DOM dom = SemanticAnalyser.analyse(sourceCode);
		String code = CodeGenerator.generateCode(dom);
		return code;
	}
}