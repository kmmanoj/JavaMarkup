package javamarkup.semanticanalyser;
public class Optgroup extends Tag{
	public Optgroup(){
		super();
		this.shortClose = false;
		this.tagName = "optgroup";
	}
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setLabel(String val) { this.labelAttribute = val; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getLabel() { return this.labelAttribute; }
}
