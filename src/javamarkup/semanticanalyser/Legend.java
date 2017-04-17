package javamarkup.semanticanalyser;
public class Legend extends Tag{
	public Legend(){
		super();
		this.shortClose = false;
		this.tagName = "legend";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
