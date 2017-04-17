package javamarkup.semanticanalyser;
public class Td extends Tag{
	public Td(){
		super();
		this.shortClose = false;
		this.tagName = "td";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setBgcolor(String val) { this.bgcolorAttribute = val; }
	@Override
	public void setColspan(String val) { this.colspanAttribute = val; }
	@Override
	public void setHeaders(String val) { this.headersAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setRowspan(String val) { this.rowspanAttribute = val; }
	@Override
	public void setScope(String val) { this.scopeAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getBgcolor() { return this.bgcolorAttribute; }
	@Override
	public String getColspan() { return this.colspanAttribute; }
	@Override
	public String getHeaders() { return this.headersAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getRowspan() { return this.rowspanAttribute; }
	@Override
	public String getScope() { return this.scopeAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
