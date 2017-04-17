package javamarkup.semanticanalyser;
public class Pre extends Tag{
	public Pre(){
		super();
		this.shortClose = false;
		this.tagName = "pre";
	}
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
