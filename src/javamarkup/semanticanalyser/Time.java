package javamarkup.semanticanalyser;
public class Time extends Tag{
	public Time(){
		super();
		this.shortClose = false;
		this.tagName = "time";
	}
	@Override
	public void setDatetime(String val) { this.datetimeAttribute = val; }
	@Override
	public String getDatetime() { return this.datetimeAttribute; }
}
