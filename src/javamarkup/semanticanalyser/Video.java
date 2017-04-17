package javamarkup.semanticanalyser;
public class Video extends Tag{
	public Video(){
		super();
		this.shortClose = true;
		this.tagName = "video";
	}
	@Override
	public void setAutoplay(String val) { this.autoplayAttribute = val; }
	@Override
	public void setControls(String val) { this.controlsAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setLoop(String val) { this.loopAttribute = val; }
	@Override
	public void setMuted(String val) { this.mutedAttribute = val; }
	@Override
	public void setPoster(String val) { this.posterAttribute = val; }
	@Override
	public void setPreload(String val) { this.preloadAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAutoplay() { return this.autoplayAttribute; }
	@Override
	public String getControls() { return this.controlsAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getLoop() { return this.loopAttribute; }
	@Override
	public String getMuted() { return this.mutedAttribute; }
	@Override
	public String getPoster() { return this.posterAttribute; }
	@Override
	public String getPreload() { return this.preloadAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
