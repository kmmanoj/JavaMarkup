package javamarkup.semanticanalyser;
public class Output extends Tag{
	public Output(){
		super();
		this.shortClose = false;
		this.tagName = "output";
	}
	@Override
	public void setFor(String val) { this.forAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public String getFor() { return this.forAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
}
