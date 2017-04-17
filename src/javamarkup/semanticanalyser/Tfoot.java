package javamarkup.semanticanalyser;
public class Tfoot extends Tag{
	public Tfoot(){
		super();
		this.shortClose = false;
		this.tagName = "tfoot";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
