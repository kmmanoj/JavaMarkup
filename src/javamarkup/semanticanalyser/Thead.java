package javamarkup.semanticanalyser;
public class Thead extends Tag{
	public Thead(){
		super();
		this.shortClose = false;
		this.tagName = "thead";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
