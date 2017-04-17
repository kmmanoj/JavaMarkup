package javamarkup.semanticanalyser;
public class Ins extends Tag{
	public Ins(){
		super();
		this.shortClose = false;
		this.tagName = "ins";
	}
	@Override
	public void setCite(String val) { this.citeAttribute = val; }
	@Override
	public void setDatetime(String val) { this.datetimeAttribute = val; }
	@Override
	public String getCite() { return this.citeAttribute; }
	@Override
	public String getDatetime() { return this.datetimeAttribute; }
}
