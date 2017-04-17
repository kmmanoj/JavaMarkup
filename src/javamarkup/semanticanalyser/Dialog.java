package javamarkup.semanticanalyser;
public class Dialog extends Tag{
	public Dialog(){
		super();
		this.shortClose = false;
		this.tagName = "dialog";
	}
	@Override
	public void setOpen(String val) { this.openAttribute = val; }
	@Override
	public String getOpen() { return this.openAttribute; }
}
