package javamarkup.semanticanalyser;
public class Hr extends Tag{
	public Hr(){
		super();
		this.shortClose = true;
		this.tagName = "hr";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setSize(String val) { this.sizeAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getSize() { return this.sizeAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
