package javamarkup.semanticanalyser;

public class Audio extends Tag{
	public Audio(){
		super();
		this.shortClose = true;
		this.tagName = "audio";
	}
	@Override
	public void setAutoplay(String val) { this.autoplayAttribute = val; }
	@Override
	public void setControls(String val) { this.controlsAttribute = val; }
	@Override
	public void setLoop(String val) { this.loopAttribute = val; }
	@Override
	public void setMuted(String val) { this.mutedAttribute = val; }
	@Override
	public void setPreload(String val) { this.preloadAttribute = val; }
	@Override
	public void setSrc(String val) { this.srcAttribute = val; }
	@Override
	public String getAutoplay() { return this.autoplayAttribute; }
	@Override
	public String getControls() { return this.controlsAttribute; }
	@Override
	public String getLoop() { return this.loopAttribute; }
	@Override
	public String getMuted() { return this.mutedAttribute; }
	@Override
	public String getPreload() { return this.preloadAttribute; }
	@Override
	public String getSrc() { return this.srcAttribute; }
}
