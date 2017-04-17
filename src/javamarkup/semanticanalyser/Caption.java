package javamarkup.semanticanalyser;
public class Caption extends Tag{
	public Caption(){
		super();
		this.shortClose = false;
		this.tagName = "caption";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
