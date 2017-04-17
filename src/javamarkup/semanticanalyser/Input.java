package javamarkup.semanticanalyser;
public class Input extends Tag{
	public Input(){
		super();
		this.shortClose = true;
		this.tagName = "input";
	}
	@Override
	public void setAccept(String val) { this.acceptAttribute = val; }
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setAlt(String val) { this.altAttribute = val; }
	@Override
	public void setAutocomplete(String val) { this.autocompleteAttribute = val; }
	@Override
	public void setAutofocus(String val) { this.autofocusAttribute = val; }
	@Override
	public void setChecked(String val) { this.checkedAttribute = val; }
	@Override
	public void setDirname(String val) { this.dirnameAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setFormaction(String val) { this.formactionAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setList(String val) { this.listAttribute = val; }
	@Override
	public void setMax(String val) { this.maxAttribute = val; }
	@Override
	public void setMaxlength(String val) { this.maxlengthAttribute = val; }
	@Override
	public void setMin(String val) { this.minAttribute = val; }
	@Override
	public void setMultiple(String val) { this.multipleAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setPattern(String val) { this.patternAttribute = val; }
	@Override
	public void setPlaceholder(String val) { this.placeholderAttribute = val; }
	@Override
	public void setReadonly(String val) { this.readonlyAttribute = val; }
	@Override
	public void setRequired(String val) { this.requiredAttribute = val; }
	@Override
	public void setSize(String val) { this.sizeAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setStep(String val) { this.stepAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAccept() { return this.acceptAttribute; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getAlt() { return this.altAttribute; }
	@Override
	public String getAutocomplete() { return this.autocompleteAttribute; }
	@Override
	public String getAutofocus() { return this.autofocusAttribute; }
	@Override
	public String getChecked() { return this.checkedAttribute; }
	@Override
	public String getDirname() { return this.dirnameAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getFormaction() { return this.formactionAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getList() { return this.listAttribute; }
	@Override
	public String getMax() { return this.maxAttribute; }
	@Override
	public String getMaxlength() { return this.maxlengthAttribute; }
	@Override
	public String getMin() { return this.minAttribute; }
	@Override
	public String getMultiple() { return this.multipleAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getPattern() { return this.patternAttribute; }
	@Override
	public String getPlaceholder() { return this.placeholderAttribute; }
	@Override
	public String getReadonly() { return this.readonlyAttribute; }
	@Override
	public String getRequired() { return this.requiredAttribute; }
	@Override
	public String getSize() { return this.sizeAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getStep() { return this.stepAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
