package javamarkup.semanticanalyser;

import javamarkup.lexicalanalyser.SymbolRecord;
import javamarkup.lexicalanalyser.Type;
import java.util.*;
import java.io.*;

public class Semantics{
	public int iter;
	public ArrayList<SymbolRecord> symbolTable;
	DOM dom;
	public Semantics(ArrayList<SymbolRecord> symbolTable){
		dom = new DOM();
		this.iter = 0;
		this.symbolTable = symbolTable;
	}
	public DOM analyse() {
		dom.root = doGraph(this.symbolTable.get(this.iter).value);
		return dom;
	}

	private TagWrapper doGraph(String tag){
		TagWrapper tagWrapper = new TagWrapper(Mapper.getTagObj(tag));
		System.err.println("parsing for tag "+tag);
		if(this.iter+1==symbolTable.size()){ System.err.println("end of symbols"); return tagWrapper; }
		SymbolRecord record = symbolTable.get(++this.iter);
		System.err.println("found this record before the while loop : "+record);
		while(record != null && record.type.getValue() != Type.TAG.getValue()){
			System.err.println("this time the record is : "+record);
			if(record.value.equals("#")){
				record = symbolTable.get(++this.iter);
				tagWrapper.tag.setId(record.value);
				if(this.iter+1==symbolTable.size()) record = null;
				else record = symbolTable.get(++this.iter);
				System.err.println("filled ids, now the record is "+record);
				if(record == null || record.type.getValue() == Type.TAG.getValue() || record.value.equals("}")) return tagWrapper;
			} else if(record.value.equals(".")){
				while(record !=null && record.value.equals(".")){
					record = symbolTable.get(++this.iter);
					tagWrapper.tag.setClasses(record.value);
					if(this.iter+1==symbolTable.size()) record = null;
					else record = symbolTable.get(++this.iter);
				}
				System.err.println("filled classes, now the record is "+record);
				if(record == null || record.type.getValue() == Type.TAG.getValue() || record.value.equals("}")) return tagWrapper;
			} else if(record.value.equals("(")){
				record = symbolTable.get(++this.iter);
				while(record.type.getValue() == Type.ATTRIBUTE.getValue()){
					String attr = record.value;
					iter += 2;
					record = symbolTable.get(this.iter);
					String value = record.value;
					int err = Mapper.checkSet(tagWrapper.tag, attr, value.substring(1,value.length()-1));
					if(err!=0){
						System.out.println("----- WARNING -----");
						System.out.println("Not setting "+value+" for "+attr+" since, the tag "+tag+" does not accept such attribute");
						System.out.println();
					}
					record = symbolTable.get(++this.iter);
					if(record.value.equals(",")) record = symbolTable.get(++this.iter);
				}
				if(this.iter+1==symbolTable.size()) record = null;
				else record = symbolTable.get(++this.iter);
				System.err.println("filled attributes, now the record is "+record);
				if(record == null || record.type.getValue() == Type.TAG.getValue() || record.value.equals("}")) return tagWrapper;
			} else if(record.value.equals("{")){
				record = symbolTable.get(++this.iter);
				if(tagWrapper.tag.shortClose){
					record = symbolTable.get(--this.iter);
					moveAcrossInvalid();
					if(this.iter+1==symbolTable.size()) record = null;
					else record = symbolTable.get(++this.iter);	
				} else if(record.type.getValue() == Type.STRING.getValue()){
					tagWrapper.tag.setInnerHTML(record.value.substring(1,record.value.length()-1));
					record = symbolTable.get(++this.iter);
					if(record.type.getValue() == Type.TAG.getValue()){
						System.out.println("---- FATAL ERROR ----");
						System.out.println("cannot have a tag after a string literal in innerhtml");
						System.out.println("COMPILE TIME ERROR; PARSING TERMINATED");
						System.exit(1);
					}
					if(this.iter+1==symbolTable.size()) record = null;
					else record = symbolTable.get(++this.iter);	
					System.err.println("At the end of setting the string as innerhtml to the tag I found this "+record);
				} else if(record.value.equals("}")){
					if(this.iter+1==symbolTable.size()) record = null;
					else record = symbolTable.get(++this.iter);		
					System.err.println("returning "+tag);
				} else {
					System.err.println("\tFound a tag inside in here : "+record);
					while(record != null && record.type.getValue() == Type.TAG.getValue()){
						this.dom.connect(tagWrapper, this.doGraph(record.value));
						record = symbolTable.get(this.iter);
					}
					System.err.println("\t after parsing the innerhtml I end up in here : "+record);
					if(this.iter+1==symbolTable.size()) record = null;
					else record = symbolTable.get(++this.iter);		
				}
				return tagWrapper;
			} else {
				System.out.println("-------- SOMETHING IS WRONG ------------");
				System.out.println("It didnt match any of # . ( and {; infact it is "+record);
				try{
					throw new Exception();
				} catch(Exception e){
					e.printStackTrace();
					System.exit(9);
				}
			}
		}
		System.err.println("IN THE END RECORD IS : "+record);
		System.err.println("returning "+tag);
		return tagWrapper;
	}
	private void moveAcrossInvalid(){
		int openbraces = 1;
		SymbolRecord rec;
		while(openbraces!=0){
			rec = this.symbolTable.get(++this.iter);
			if(rec.value.equals("{")) openbraces++;
			else if(rec.value.equals("}")) openbraces--;
		}
	}
}