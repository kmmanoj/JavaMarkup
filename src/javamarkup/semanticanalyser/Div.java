package javamarkup.semanticanalyser;
public class Div extends Tag{
	public Div(){
		super();
		this.shortClose = false;
		this.tagName = "div";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
