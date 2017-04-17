package javamarkup.semanticanalyser;
public class Details extends Tag{
	public Details(){
		super();
		this.shortClose = false;
		this.tagName = "details";
	}
	@Override
	public void setOpen(String val) { this.openAttribute = val; }
	@Override
	public String getOpen() { return this.openAttribute; }
}
