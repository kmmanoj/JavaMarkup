package javamarkup.semanticanalyser;
public class H3 extends Tag{
	public H3(){
		super();
		this.shortClose = false;
		this.tagName = "h3";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
