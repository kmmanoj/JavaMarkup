package javamarkup.semanticanalyser;
public class H5 extends Tag{
	public H5(){
		super();
		this.shortClose = false;
		this.tagName = "h5";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
}
