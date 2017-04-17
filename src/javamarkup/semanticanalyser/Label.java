package javamarkup.semanticanalyser;
public class Label extends Tag{
	public Label(){
		super();
		this.shortClose = false;
		this.tagName = "label";
	}
	@Override
	public void setFor(String val) { this.forAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public String getFor() { return this.forAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
}
