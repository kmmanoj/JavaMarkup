package javamarkup.lexicalanalyser;

import java.util.regex.*;
import java.io.*;
import javamarkup.utilities.Sys;

/*
*	This class is used to implement the first phase of lexical analysis : comment removal
*	It provides an interface to remove comments from the source code
*/
class CommentRemover{
	/*
	*	Utility method to remove comments from the input parameter line
	*	@param line the input line containing code and comments
	*	@return pure code string, or null if the line is completely a comment
	*/
	private static String removeCommentUtility(String line){
		try{
			Pattern comment = Pattern.compile("(.*)(//)(.*)");
			Pattern notEmptyLine = Pattern.compile("([^ \t]+)");
			Matcher matcher;
			matcher = comment.matcher(line);
			if(matcher.find()){
				line = matcher.group(1);
			}
			matcher = notEmptyLine.matcher(line);
			if(matcher.find()){
				return line;
			} else {
				return null;
			}
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	/*
	*	This method is used to remove all the comments from the input file, and return the status code after processing
	*	@param inputFile the source code file object
	*	@return integer representing the return status code on processing
	*/
	public static int removeComments(File inputFile) throws IOException {
		String path = inputFile.getParent();
		String fileName =inputFile.getName().split("[.]")[0];
		File outputFile = new File(path+"/"+fileName+".clean.jm");
		if(!outputFile.exists())
			outputFile.createNewFile();

		if(!inputFile.canRead()){
			Sys.error(6,inputFile.toString());
			return 6;
		}
		if(!outputFile.canWrite()){
			Sys.error(7,outputFile.toString());
			return 7;
		}

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		String line;
		while((line = reader.readLine())!=null){
			line = removeCommentUtility(line);
			if(line != null)
				writer.write(line+"\n");
		}
		reader.close();
		writer.close();
		return 0;
	}
}