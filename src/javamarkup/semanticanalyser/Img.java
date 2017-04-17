package javamarkup.semanticanalyser;
public class Img extends Tag{
	public Img(){
		super();
		this.shortClose = true;
		this.tagName = "img";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setAlt(String val) { this.altAttribute = val; }
	@Override
	public void setBorder(String val) { this.borderAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setIsmap(String val) { this.ismapAttribute = val; }
	@Override
	public void setSizes(String val) { this.sizesAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setSrcset(String val) { this.srcsetAttribute = val; }
	@Override
	public void setUsemap(String val) { this.usemapAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getAlt() { return this.altAttribute; }
	@Override
	public String getBorder() { return this.borderAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getIsmap() { return this.ismapAttribute; }
	@Override
	public String getSizes() { return this.sizesAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getSrcset() { return this.srcsetAttribute; }
	@Override
	public String getUsemap() { return this.usemapAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
