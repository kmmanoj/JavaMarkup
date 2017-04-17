package javamarkup.semanticanalyser;
public class Script extends Tag{
	public Script(){
		super();
		this.shortClose = false;
		this.tagName = "script";
	}
	@Override
	public void setAsync(String val) { this.asyncAttribute = val; }
	@Override
	public void setCharset(String val) { this.charsetAttribute = val; }
	@Override
	public void setDefer(String val) { this.deferAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getAsync() { return this.asyncAttribute; }
	@Override
	public String getCharset() { return this.charsetAttribute; }
	@Override
	public String getDefer() { return this.deferAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
