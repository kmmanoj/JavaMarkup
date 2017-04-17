package javamarkup.semanticanalyser;
public class Q extends Tag{
	public Q(){
		super();
		this.shortClose = false;
		this.tagName = "q";
	}
	@Override
	public void setCite(String val) { this.citeAttribute = val; }
	@Override
	public String getCite() { return this.citeAttribute; }
}
