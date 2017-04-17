package javamarkup.semanticanalyser;

public class Base extends Tag{
	public Base(){
		super();
		this.shortClose = true;
		this.tagName = "base";
	}
	@Override
	public void setHref(String val) { this.hrefAttribute = val; }
	@Override
	public void setTarget(String val) { this.targetAttribute = val; }
	@Override
	public String getHref() { return this.hrefAttribute; }
	@Override
	public String getTarget() { return this.targetAttribute; }
}
