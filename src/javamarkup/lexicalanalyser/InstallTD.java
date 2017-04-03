package javamarkup.lexicalanalyser;

import java.io.*;

public class InstallTD{
	public static void main(String args[]){
		TransitionDiagram td = TransitionDiagram.getTransitionDiagram();
		try {
			FileOutputStream opfile = new FileOutputStream("td.ser");
			ObjectOutputStream objout = new ObjectOutputStream(opfile);
			objout.writeObject(td);
			objout.close();
			opfile.close();
		} catch(IOException e) { 
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}