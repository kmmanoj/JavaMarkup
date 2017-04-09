package javamarkup.syntaxanalyser;

import java.util.*;

public class PredictiveParsingTable{
	static HashMap<Character, HashMap<Character, String>> table;
	private static void fillTable(){
		table = new HashMap<>();
		HashMap<Character, String> recordS = new HashMap<>();
		recordS.put('t',"tPAHX");
		table.put('S',recordS);

		HashMap<Character, String> recordX = new HashMap<>();
		recordX.put('t',"S");
		recordX.put('$',"");
		table.put('X',recordX);

		HashMap<Character, String> recordP = new HashMap<>();
		recordP.put('t',"DC");
		recordP.put('.',"DC");
		recordP.put('#',"DC");
		recordP.put('(',"DC");
		recordP.put('{',"DC");
		recordP.put('$',"DC");
		table.put('P',recordP);

		HashMap<Character, String> recordC = new HashMap<>();
		recordC.put('t',"");
		recordC.put('.',".iC");
		recordC.put('(',"");
		recordC.put('{',"");
		recordC.put('$',"");
		table.put('C',recordC);

		HashMap<Character, String> recordD = new HashMap<>();
		recordD.put('t',"");
		recordD.put('.',"");
		recordD.put('#',"#i");
		recordD.put('(',"");
		recordD.put('{',"");
		recordD.put('$',"");
		table.put('D',recordD);

		HashMap<Character, String> recordA = new HashMap<>();
		recordA.put('t',"");
		recordA.put('(',"(L)");
		recordA.put('$',"");
		table.put('A',recordA);

		HashMap<Character, String> recordL = new HashMap<>();
		recordL.put('a',"a=sM");
		recordL.put(')',"");
		table.put('L',recordL);

		HashMap<Character, String> recordM = new HashMap<>();
		recordM.put(',',",a=sM");
		recordM.put(')',"");
		table.put('M',recordM);

		HashMap<Character, String> recordH = new HashMap<>();
		recordH.put('t',"");
		recordH.put('$',"");
		recordH.put('{',"{I}");
		table.put('H',recordH);

		HashMap<Character, String> recordI = new HashMap<>();
		recordI.put('t',"S");
		recordI.put('s',"s");
		recordI.put('}',"");
		table.put('I',recordI);
	}

	public static void initTable(){
		if(table == null) 
			fillTable();
	}

	public static String M(Character nonTerminal, Character terminal){
		return table.get(nonTerminal).get(terminal);
	}
}