package javamarkup.semanticanalyser;
public class Map extends Tag{
	public Map(){
		super();
		this.shortClose = false;
		this.tagName = "map";
	}
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public String getName() { return this.nameAttribute; }
}
