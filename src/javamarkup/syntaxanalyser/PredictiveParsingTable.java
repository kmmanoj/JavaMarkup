package javamarkup.syntaxanalyser;

import java.util.*;

public class PredictiveParsingTable{
	static HashMap<String, HashMap<String, String>> table;
	private static void fillTable(){
		table = new HashMap<>();
		HashMap<String, String> recordS = new HashMap<>();
		recordS.put("t","XHAPt");
		recordS.put("}","");
		table.put("S",recordS);

		HashMap<String, String> recordX = new HashMap<>();
		recordX.put("t","S");
		recordX.put("$","");
		recordX.put("}","");
		table.put("X",recordX);

		HashMap<String, String> recordP = new HashMap<>();
		recordP.put("t","CD");
		recordP.put(".","CD");
		recordP.put("#","CD");
		recordP.put("(","CD");
		recordP.put("{","CD");
		recordP.put("$","CD");
		table.put("P",recordP);

		HashMap<String, String> recordC = new HashMap<>();
		recordC.put("t","");
		recordC.put(".","Ci.");
		recordC.put("(","");
		recordC.put("{","");
		recordC.put("$","");
		table.put("C",recordC);

		HashMap<String, String> recordD = new HashMap<>();
		recordD.put("t","");
		recordD.put(".","");
		recordD.put("#","i#");
		recordD.put("(","");
		recordD.put("{","");
		recordD.put("$","");
		table.put("D",recordD);

		HashMap<String, String> recordA = new HashMap<>();
		recordA.put("t","");
		recordA.put("(",")L(");
		recordA.put("$","");
		recordA.put("{","");
		table.put("A",recordA);

		HashMap<String, String> recordL = new HashMap<>();
		recordL.put("a","Ms=a");
		recordL.put(")","");
		table.put("L",recordL);

		HashMap<String, String> recordM = new HashMap<>();
		recordM.put(",","Ms=a,");
		recordM.put(")","");
		table.put("M",recordM);

		HashMap<String, String> recordH = new HashMap<>();
		recordH.put("t","");
		recordH.put("$","");
		recordH.put("{","}I{");
		table.put("H",recordH);

		HashMap<String, String> recordI = new HashMap<>();
		recordI.put("t","S");
		recordI.put("s","s");
		recordI.put("}","");
		table.put("I",recordI);
	}

	public static void initTable(){
		if(table == null) 
			fillTable();
	}

	public static String M(String nonTerminal, String terminal){
		if(nonTerminal=="$") return null;
		else if(table.get(nonTerminal).containsKey(terminal)) return table.get(nonTerminal).get(terminal);
		else return null; 
	}
}