package javamarkup.semanticanalyser;
public class P extends Tag{
	public P(){
		super();
		this.shortClose = false;
		this.tagName = "p";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
