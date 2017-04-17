package javamarkup.semanticanalyser;
public class Body extends Tag{
	public Body(){
		super();
		this.shortClose = false;
		this.tagName = "body";
	}
	@Override
	public void setBgcolor(String val) { this.bgcolorAttribute = val; }
	@Override
	public String getBgcolor() { return this.bgcolorAttribute; }
}
