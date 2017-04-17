package javamarkup.semanticanalyser;
public class Link extends Tag{
	public Link(){
		super();
		this.shortClose = true;
		this.tagName = "link";
	}
	@Override
	public void setCharset(String val) { this.charsetAttribute = val; }
	@Override
	public void setHref(String val) { this.hrefAttribute = val; }
	@Override
	public void setHreflang(String val) { this.hreflangAttribute = val; }
	@Override
	public void setMedia(String val) { this.mediaAttribute = val; }
	@Override
	public void setRel(String val) { this.relAttribute = val; }
	@Override
	public void setSizes(String val) { this.sizesAttribute = val; }
	@Override
	public void setTarget(String val) { this.targetAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getCharset() { return this.charsetAttribute; }
	@Override
	public String getHref() { return this.hrefAttribute; }
	@Override
	public String getHreflang() { return this.hreflangAttribute; }
	@Override
	public String getMedia() { return this.mediaAttribute; }
	@Override
	public String getRel() { return this.relAttribute; }
	@Override
	public String getSizes() { return this.sizesAttribute; }
	@Override
	public String getTarget() { return this.targetAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
