package javamarkup.semanticanalyser;

public class Basefont extends Tag{
	public Basefont(){
		super();
		this.shortClose = false;
		this.tagName = "basefont";
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
