package javamarkup.semanticanalyser;
public class Colgroup extends Tag{
	public Colgroup(){
		super();
		this.shortClose = false;
		this.tagName = "colgroup";
	}
	@Override
	public void setSpan(String val) { this.spanAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getSpan() { return this.spanAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
