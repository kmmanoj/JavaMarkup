package javamarkup.semanticanalyser;
public class Frameset extends Tag{
	public Frameset(){
		super();
		this.shortClose = false;
		this.tagName = "frameset";
	}
	@Override
	public void setCols(String val) { this.colsAttribute = val; }
	@Override
	public void setRows(String val) { this.rowsAttribute = val; }
	@Override
	public String getCols() { return this.colsAttribute; }
	@Override
	public String getRows() { return this.rowsAttribute; }
}
