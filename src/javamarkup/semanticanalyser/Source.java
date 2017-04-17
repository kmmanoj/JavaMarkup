package javamarkup.semanticanalyser;
public class Source extends Tag{
	public Source(){
		super();
		this.shortClose = false;
		this.tagName = "source";
	}
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setSrcset(String val) { this.srcsetAttribute = val; }
	@Override
	public void setMedia(String val) { this.mediaAttribute = val; }
	@Override
	public void setSizes(String val) { this.sizesAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getSrcset() { return this.srcsetAttribute; }
	@Override
	public String getMedia() { return this.mediaAttribute; }
	@Override
	public String getSizes() { return this.sizesAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
