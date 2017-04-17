package javamarkup.semanticanalyser;
public class Canvas extends Tag{
	public Canvas(){
		super();
		this.shortClose = false;
		this.tagName = "canvas";
	}
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
