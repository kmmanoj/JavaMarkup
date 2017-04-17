package javamarkup.semanticanalyser;
public class Track extends Tag{
	public Track(){
		super();
		this.shortClose = false;
		this.tagName = "track";
	}
	@Override
	public void setDefault(String val) { this.defaultAttribute = val; }
	@Override
	public void setKind(String val) { this.kindAttribute = val; }
	@Override
	public void setLabel(String val) { this.labelAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setSrclang(String val) { this.srclangAttribute = val; }
	@Override
	public String getDefault() { return this.defaultAttribute; }
	@Override
	public String getKind() { return this.kindAttribute; }
	@Override
	public String getLabel() { return this.labelAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getSrclang() { return this.srclangAttribute; }
}
