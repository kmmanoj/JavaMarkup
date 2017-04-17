package javamarkup.semanticanalyser;
public class Fieldset extends Tag{
	public Fieldset(){
		super();
		this.shortClose = false;
		this.tagName = "fieldset";
	}
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
}
