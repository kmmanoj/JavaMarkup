package javamarkup.semanticanalyser;

public class A extends Tag{
	public A(){
		super();
		this.shortClose = false;
		this.tagName = "a";
	}
	@Override
	public void setCharset(String val) { this.charsetAttribute = val; }
	@Override
	public void setCoords(String val) { this.coordsAttribute = val; }
	@Override
	public void setDownload(String val) { this.downloadAttribute = val; }
	@Override
	public void setHref(String val) { this.hrefAttribute = val; }
	@Override
	public void setHreflang(String val) { this.hreflangAttribute = val; }
	@Override
	public void setMedia(String val) { this.mediaAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setRel(String val) { this.relAttribute = val; }
	@Override
	public void setShape(String val) { this.shapeAttribute = val; }
	@Override
	public void setTarget(String val) { this.targetAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getCharset() { return this.charsetAttribute; }
	@Override
	public String getCoords() { return this.coordsAttribute; }
	@Override
	public String getDownload() { return this.downloadAttribute; }
	@Override
	public String getHref() { return this.hrefAttribute; }
	@Override
	public String getHreflang() { return this.hreflangAttribute; }
	@Override
	public String getMedia() { return this.mediaAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getRel() { return this.relAttribute; }
	@Override
	public String getShape() { return this.shapeAttribute; }
	@Override
	public String getTarget() { return this.targetAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
