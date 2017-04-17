package javamarkup.semanticanalyser;
public class Embed extends Tag{
	public Embed(){
		super();
		this.shortClose = false;
		this.tagName = "embed";
	}
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
