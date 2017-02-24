package javamarkup.lexicalanalyser;

import java.io.*;
// import javamarkup.lexicalanalyser.CommentRemover;

public class LexicalAnalyser{
	public static void analyse(File sourceCode){
		try{
			int status = CommentRemover.removeComments(sourceCode);
			//TO CODE tokenize and other functions 
		} catch(IOException e){
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}