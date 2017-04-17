package javamarkup.semanticanalyser;
public class Button extends Tag{
	public Button(){
		super();
		this.shortClose = false;
		this.tagName = "button";
	}
	@Override
	public void setAutofocus(String val) { this.autofocusAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setFormaction(String val) { this.formactionAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getAutofocus() { return this.autofocusAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getFormaction() { return this.formactionAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
