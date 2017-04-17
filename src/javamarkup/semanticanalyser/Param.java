package javamarkup.semanticanalyser;
public class Param extends Tag{
	public Param(){
		super();
		this.shortClose = false;
		this.tagName = "param";
	}
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
