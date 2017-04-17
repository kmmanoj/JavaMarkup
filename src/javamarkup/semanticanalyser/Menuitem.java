package javamarkup.semanticanalyser;
public class Menuitem extends Tag{
	public Menuitem(){
		super();
		this.shortClose = false;
		this.tagName = "menuitem";
	}
	@Override
	public void setChecked(String val) { this.checkedAttribute = val; }
	@Override
	public void setDefault(String val) { this.defaultAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setLabel(String val) { this.labelAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getChecked() { return this.checkedAttribute; }
	@Override
	public String getDefault() { return this.defaultAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getLabel() { return this.labelAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
