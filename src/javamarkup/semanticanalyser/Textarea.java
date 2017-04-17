package javamarkup.semanticanalyser;
public class Textarea extends Tag{
	public Textarea(){
		super();
		this.shortClose = false;
		this.tagName = "textarea";
	}
	@Override
	public void setAutofocus(String val) { this.autofocusAttribute = val; }
	@Override
	public void setCols(String val) { this.colsAttribute = val; }
	@Override
	public void setDirname(String val) { this.dirnameAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setMaxlength(String val) { this.maxlengthAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setPlaceholder(String val) { this.placeholderAttribute = val; }
	@Override
	public void setReadonly(String val) { this.readonlyAttribute = val; }
	@Override
	public void setRequired(String val) { this.requiredAttribute = val; }
	@Override
	public void setRows(String val) { this.rowsAttribute = val; }
	@Override
	public void setWrap(String val) { this.wrapAttribute = val; }
	@Override
	public String getAutofocus() { return this.autofocusAttribute; }
	@Override
	public String getCols() { return this.colsAttribute; }
	@Override
	public String getDirname() { return this.dirnameAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getMaxlength() { return this.maxlengthAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getPlaceholder() { return this.placeholderAttribute; }
	@Override
	public String getReadonly() { return this.readonlyAttribute; }
	@Override
	public String getRequired() { return this.requiredAttribute; }
	@Override
	public String getRows() { return this.rowsAttribute; }
	@Override
	public String getWrap() { return this.wrapAttribute; }
}
