package javamarkup.semanticanalyser;
public class Li extends Tag{
	public Li(){
		super();
		this.shortClose = false;
		this.tagName = "ll";
	}
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
