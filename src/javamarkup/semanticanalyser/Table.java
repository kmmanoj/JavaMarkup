package javamarkup.semanticanalyser;
public class Table extends Tag{
	public Table(){
		super();
		this.shortClose = false;
		this.tagName = "table";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setBgcolor(String val) { this.bgcolorAttribute = val; }
	@Override
	public void setBorder(String val) { this.borderAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getBgcolor() { return this.bgcolorAttribute; }
	@Override
	public String getBorder() { return this.borderAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
