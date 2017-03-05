package javamarkup.lexicalanalyser;

import java.io.*;


/**
*	The interface class that provides lexical analysis functionality
*	It collects and makes use of the friendly classes' methods and variables used in this package
*	to provide abstract overview of the working of lexical Analyser
*/
public class LexicalAnalyser{
	public static void analyse(File sourceCode){
		try{
			int status = CommentRemover.removeComments(sourceCode);
			if(status != 0)
				throw new Exception("Exception occured while removing comments from the file");

			File cleanFile = new File((new File(sourceCode.getName().split("[.]")[0]+".clean.jm")).getAbsolutePath());
			if(!cleanFile.exists())
				throw new Exception("Unable to access pure source code file for TOKENIZATION");
			Tokenizer.tokenize(cleanFile);
			//TO CODE 

		} catch(IOException e){
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}