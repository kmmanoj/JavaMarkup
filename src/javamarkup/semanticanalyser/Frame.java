package javamarkup.semanticanalyser;
public class Frame extends Tag{
	public Frame(){
		super();
		this.shortClose = true;
		this.tagName = "frame";
	}
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
}
