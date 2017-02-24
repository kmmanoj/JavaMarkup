package javamarkup.utilities;

import java.io.*;

/**
*	This class is used to provide an interface to execute certain system functions 
*/
public class Sys{
	/**
	*	This method is used to execute a shell script and print the output on stdout
	*	@param command It is the command to be executed
	*	@return returns the status code on execution of the shell script
	*/
	public static int executeCommand(String command){
		int status = -1;
		try{
			Process shell = Runtime.getRuntime().exec(command);
			BufferedReader outputReader = new BufferedReader(new InputStreamReader(shell.getInputStream()));
			String line;
			while((line=outputReader.readLine())!=null)
				System.out.println(line);
			status = shell.waitFor();
			if(status!=0){
				System.err.println("Error in executing command : "+command);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}


	/**
	*	This method is used as the error handler in different cases
	*	It additionally accepts variable number of parameters that is used according to the requirements for error output
	*	@param errorCode specifies the type of system or command line error that occured
	*	<ul>
	*	<li>1 : no input files given</li>
	*	<li>2 : missing output file</li>
	*	<li>3 : unrecognized command line argument</li>
	*	<li>4 : unrecognized file format</li>
	*	<li>5 : file already exists</li>
	*	<li>6 : insufficient permission to read from the file</li>
	*	<li>7 : insufficient permission to write into the file</li>
	*	<li>7 : file not found</li>
	*	</ul>
	*	@param args variable number of String parameters, to support additional data to output error
	*	@return void
	*/
	public static void error(int errorCode, String ... args) {
			try{
				switch(errorCode){
					case 1 	: 	// no input files given
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mfatal error:\\033[0m no input files");
								System.err.println("parsing terminated.");
								System.exit(1);
								break;
					case 2 	:	// missing output file
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31merror:\\033[0m missing filename after \\033[1m\'-o\'\\033[0m");	
								break;
					case 3	:	// unrecognized command line argument
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31merror:\\033[0m unrecognized command line option \\033[1m\'"+args[0]+"\'\\033[0m");	
								break;
					case 4	:	// unrecognized file format i.e. it is different from .jm
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mfatal error:\\033[0m unrecognized file format ");
								System.err.println("parsing terminated.");
								System.exit(4);
								break;
					case 5	:	// the file mentioned already exists
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mfatal error:\\033[0m \'"+args[0]+"\' already exists. Unknown target");
								System.err.println("parsing terminated.");
								System.exit(5);
								break;
					case 6	: 	// permission denied for read
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mpermission denied:\\033[0m \'"+args[0]+"\' doesn't have read permissions");
								System.err.println("parsing terminated.");
								System.exit(6);
								break;
					case 7	: 	// permission denied for write
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mpermission denied:\\033[0m \'"+args[0]+"\' doesn't have write permissions");
								System.err.println("parsing terminated.");
								System.exit(7);
								break;
					case 8	:	// input file not found
								Sys.executeCommand("echo -e \\033[1mjmparse: \\033[31mfatal error:\\033[0m \'"+args[0]+"\' file not found");
								System.err.println("parsing terminated.");
								System.exit(8);
					default : 	// any other case
								break;
				}
			} catch(Exception e){
				System.err.println("Code is corrupted");
				System.exit(errorCode);
			}
	}
}