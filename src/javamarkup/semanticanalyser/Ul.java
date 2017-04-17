package javamarkup.semanticanalyser;
public class Ul extends Tag{
	public Ul(){
		super();
		this.shortClose = false;
		this.tagName = "ul";
	}
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getType() { return this.typeAttribute; }
}
