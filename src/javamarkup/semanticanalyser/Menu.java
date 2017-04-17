package javamarkup.semanticanalyser;
public class Menu extends Tag{
	public Menu(){
		super();
		this.shortClose = false;
		this.tagName = "menu";
	}
	@Override
	public void setLabel(String val) { this.labelAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public String getLabel() { return this.labelAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
}
