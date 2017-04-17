package javamarkup.semanticanalyser;
public class Tbody extends Tag{
	public Tbody(){
		super();
		this.shortClose = false;
		this.tagName = "tbody";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
