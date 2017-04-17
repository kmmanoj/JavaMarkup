package javamarkup.semanticanalyser;
public class Progress extends Tag{
	public Progress(){
		super();
		this.shortClose = false;
		this.tagName = "progress";
	}
	@Override
	public void setMax(String val) { this.maxAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getMax() { return this.maxAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
