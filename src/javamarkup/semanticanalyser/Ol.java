package javamarkup.semanticanalyser;
public class Ol extends Tag{
	public Ol(){
		super();
		this.shortClose = false;
		this.tagName = "ol";
	}
	@Override
	public void setReversed(String val) { this.reversedAttribute = val; }
	@Override
	public void setStart(String val) { this.startAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getReversed() { return this.reversedAttribute; }
	@Override
	public String getStart() { return this.startAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
