package javamarkup.semanticanalyser;
public class Blockquote extends Tag{
	public Blockquote(){
		super();
		this.shortClose = false;
		this.tagName = "blockquote";
	}
	@Override
	public void setCite(String val) { this.citeAttribute = val; }
	@Override
	public String getCite() { return this.citeAttribute; }
}
