package javamarkup.semanticanalyser;
public class Tr extends Tag{
	public Tr(){
		super();
		this.shortClose = false;
		this.tagName = "tr";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setBgcolor(String val) { this.bgcolorAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getBgcolor() { return this.bgcolorAttribute; }
}
