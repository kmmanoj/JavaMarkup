package javamarkup.semanticanalyser;

public class Applet extends Tag{
	public Applet(){
		super();
		this.shortClose = false;
		this.tagName = "applet";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setAlt(String val) { this.altAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getAlt() { return this.altAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
