package javamarkup.semanticanalyser;
public class Font extends Tag{
	public Font(){
		super();
		this.shortClose = false;
		this.tagName = "font";
	}
	@Override
	public void setColor(String val) { this.colorAttribute = val; }
	@Override
	public void setSize(String val) { this.sizeAttribute = val; }
	@Override
	public String getColor() { return this.colorAttribute; }
	@Override
	public String getSize() { return this.sizeAttribute; }
}
