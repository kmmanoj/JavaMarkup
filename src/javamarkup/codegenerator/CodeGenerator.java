package javamarkup.codegenerator;

import javamarkup.semanticanalyser.DOM;

public class CodeGenerator{
	public static String generateCode(DOM dom){
		return dom.printCode(dom.root, 0);
	}
}