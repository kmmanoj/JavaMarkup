package javamarkup.semanticanalyser;
public class H2 extends Tag{
	public H2(){
		super();
		this.shortClose = false;
		this.tagName = "h2";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
