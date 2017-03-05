package javamarkup;

import java.io.*;
import javamarkup.utilities.Sys;
import javamarkup.lexicalanalyser.LexicalAnalyser;

/**
*	<h3>Client class</h3>
*	It is at the highest Level of abstraction
*	This class handles the command line arguments and performs functions according to the command line options and arguments 
*/
public class Main{	
	private static boolean saveTemps = false;
	private static File outputFile;
	private static File inputFile;

	/*
	*	This method is used to print the usage of the command line utility on stdout
	*/
	private static void printUsage(){
	    Sys.executeCommand("echo -e \\033[1mUSAGE: \\033[0m ");
	    System.out.println(" jmparse [options] template_file ... ");
	    System.out.println("");
    	Sys.executeCommand("echo -e \\033[1mOPTIONS: \\033[0m ");
	    System.out.printf(" %-20s  \n","-s");
	    System.out.printf(" %-20s  To save intermediate files generated\n\n","--save-temps");
	    System.out.printf(" %-20s  \n","-o <file>");
	    System.out.printf(" %-20s  To place the output into <file>\n\n","--output <file>");
	    System.out.printf(" %-20s  \n","-h");
	    System.out.printf(" %-20s  Shows usage and help \n\n","--help");
	}

	/*
	*	This method is similar to the printUsage() method
	*	It gives more description about the javamarkup command line utility
	*/
	private static void printHelpPage(){
	    Sys.executeCommand("echo -e \\033[1;35m---JavaMarkup---\\033[0m ");
	    System.out.println();
	    Sys.executeCommand("echo -e \\033[1mDESCRIPTION: \\033[0m ");
	    System.out.println(" This utility is used to parse easy template HTML-like Sys into html Sys\n");
	    printUsage();
	    Sys.executeCommand("echo -e \\033[1mAUTHOR: \\033[0m ");
	    System.out.println(" Written by Manoj Vignesh K M, Nipun Mediratta and Manoj Koneri T");
	    System.out.println();
	    System.out.println();
	}

	/**
	*	This is the main function of the JavaMarkup utility
	*	This method handles the CLI arguments and options, and performs functions accordingly
	*	@param args form the command line arguments 
	*	@return void
	*/
	public static void main(String args[]){
		if(args.length == 0){
			printUsage();
			Sys.error(1);
		}
		for(int i=0;i<args.length;i++){
			switch(args[i].charAt(0)){
				case '-':
				{
					if(args[i].equals("--help") || args[i].equals("-h")){
						printHelpPage();
						System.exit(0);
					} else if(args[i].equals("--output") || args[i].equals("-o")){
						if(i+1>=args.length){
							Sys.error(2);	
							// if output file not mentioned even if -o flag is turned on, default to index.html
							System.err.println("Redirecting into default file : index.html");
							outputFile = new File((new File("index.html")).getAbsolutePath());
						}
						if(outputFile == null)
							outputFile = new File((new File(args[++i])).getAbsolutePath());
						// if the file already exists, default to index.html, else create the file
						if(outputFile.exists()){
							System.err.println("File already exists");
							Sys.error(5,outputFile.toString());
							outputFile = new File((new File("index.html")).getAbsolutePath());
						} else {
							try{
								outputFile.createNewFile();	
							}catch(IOException e){
								e.printStackTrace();
							}catch(Exception e){
								e.printStackTrace();
							}
						}
						//check if the output file mentioned is of html type, if no then warn 
						String[] fileAndExt = outputFile.getName().split("[.]");
						if(fileAndExt.length==1 || !(fileAndExt[1].equals("html"))){
							Sys.executeCommand("echo -e \\033[1mjmparse: \\033[35mwarning:\\033[0m output file should have .html as extension");
						}
					} else if(args[i].equals("--save-temps")  || args[i].equals("-s")){
						saveTemps = true;
					} else {
						Sys.error(3,args[i]);
					} 
					break;
				}
				default :
				{
					// if it is not a command line option then, it is the input file
					inputFile = new File((new File(args[i])).getAbsolutePath());
					// check if the input file is of type jm, if no then exit with error
					String[] fileAndExt = inputFile.getName().split("[.]");
					if(fileAndExt.length==1 || !(fileAndExt[1].equals("jm"))){
						Sys.error(4);
					}
				}
			}	
		}

		if(inputFile == null){
			if(outputFile != null)
				outputFile.delete();
			Sys.error(1);
		} else if(!inputFile.exists()){
			if(outputFile != null)
				outputFile.delete();
			Sys.error(8, inputFile.getName());
		}
		if(outputFile==null){
			outputFile = new File((new File("index.html")).getAbsolutePath());
			try{
				if(!outputFile.exists())
					outputFile.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		System.out.println("// // // To compilation with saveTemps : "+saveTemps+", input : "+inputFile+" and output : "+outputFile);

		LexicalAnalyser.analyse(inputFile);

		/*
		*	TO CODE functions to perform after the environment and requirements are set
		*	...
		*	...
		*	...
		*/

		if(!saveTemps){
			Sys.executeCommand("rm "+inputFile.getName().split("[.]")[0]+".clean.jm");
			Sys.executeCommand("rm "+inputFile.getName().split("[.]")[0]+".symboltable.jm");
		}

		if(!outputFile.canWrite()){
			Sys.error(7,outputFile.toString());
		}
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			writer.write("<html>\n\tLoading...\n</html>");
			writer.close();
		} catch(IOException e){
			outputFile.delete();
			e.printStackTrace();
		} catch(Exception e){
			outputFile.delete();
			e.printStackTrace();
		}
	}
}