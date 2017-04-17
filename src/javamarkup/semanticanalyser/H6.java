package javamarkup.semanticanalyser;
public class H6 extends Tag{
	public H6(){
		super();
		this.shortClose = false;
		this.tagName = "h6";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
