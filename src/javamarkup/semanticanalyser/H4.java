package javamarkup.semanticanalyser;
public class H4 extends Tag{
	public H4(){
		super();
		this.shortClose = false;
		this.tagName = "h4";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
