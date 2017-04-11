package javamarkup.lexicalanalyser;

public class SymbolRecord{
	public int tokenCount;
	public Type type;
	public String value;
	public SymbolRecord(int tc, String value, Type type){
		this.tokenCount = tc;
		this.value = value;
		this.type = type;
	}
	@Override
	public String toString(){
		return this.tokenCount+" "+this.value+" "+this.type.getTypeName();
	}
}