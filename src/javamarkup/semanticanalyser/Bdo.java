package javamarkup.semanticanalyser;

public class Bdo extends Tag{
	public Bdo(){
		super();
		this.shortClose = true;
		this.tagName = "bdo";
	}
	@Override
	public void setDir(String val) { this.dirAttribute = val; }
	@Override
	public String getDir() { return this.dirAttribute; }
}
