package javamarkup.semanticanalyser;
public class Iframe extends Tag{
	public Iframe(){
		super();
		this.shortClose = true;
		this.tagName = "iframe";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setSandbox(String val) { this.sandboxAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setSrcdoc(String val) { this.srcdocAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getSandbox() { return this.sandboxAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getSrcdoc() { return this.srcdocAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
