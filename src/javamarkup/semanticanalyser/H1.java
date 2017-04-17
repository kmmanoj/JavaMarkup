package javamarkup.semanticanalyser;
public class H1 extends Tag{
	public H1(){
		super();
		this.shortClose = false;
		this.tagName = "h1";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
