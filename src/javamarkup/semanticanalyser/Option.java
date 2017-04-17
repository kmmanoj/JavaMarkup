package javamarkup.semanticanalyser;
public class Option extends Tag{
	public Option(){
		super();
		this.shortClose = false;
		this.tagName = "option";
	}
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setLabel(String val) { this.labelAttribute = val; }
	@Override
	public void setSelected(String val) { this.selectedAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getLabel() { return this.labelAttribute; }
	@Override
	public String getSelected() { return this.selectedAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
