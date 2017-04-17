package javamarkup.semanticanalyser;
public class Style extends Tag{
	public Style(){
		super();
		this.shortClose = false;
		this.tagName = "style";
	}
	@Override
	public void setMedia(String val) { this.mediaAttribute = val; }
	@Override
	public void setScoped(String val) { this.scopedAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getMedia() { return this.mediaAttribute; }
	@Override
	public String getScoped() { return this.scopedAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
