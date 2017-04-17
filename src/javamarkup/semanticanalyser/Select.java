package javamarkup.semanticanalyser;
public class Select extends Tag{
	public Select(){
		super();
		this.shortClose = false;
		this.tagName = "select";
	}
	@Override
	public void setAutofocus(String val) { this.autofocusAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setMultiple(String val) { this.multipleAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setRequired(String val) { this.requiredAttribute = val; }
	@Override
	public void setSize(String val) { this.sizeAttribute = val; }
	@Override
	public String getAutofocus() { return this.autofocusAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getMultiple() { return this.multipleAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getRequired() { return this.requiredAttribute; }
	@Override
	public String getSize() { return this.sizeAttribute; }
}
