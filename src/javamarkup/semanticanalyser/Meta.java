package javamarkup.semanticanalyser;
public class Meta extends Tag{
	public Meta(){
		super();
		this.shortClose = true;
		this.tagName = "meta";
	}
	@Override
	public void setCharset(String val) { this.charsetAttribute = val; }
	@Override
	public void setContent(String val) { this.contentAttribute = val; }
	@Override
	public void setHttpEquiv(String val) { this.httpEquivAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public String getCharset() { return this.charsetAttribute; }
	@Override
	public String getContent() { return this.contentAttribute; }
	@Override
	public String getHttpEquiv() { return this.httpEquivAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
}
