package javamarkup.semanticanalyser;
public class Object extends Tag{
	public Object(){
		super();
		this.shortClose = false;
		this.tagName = "object";
	}
	@Override
	public void setAlign(String val) { this.alignAttribute = val; }
	@Override
	public void setBorder(String val) { this.borderAttribute = val; }
	@Override
	public void setData(String val) { this.dataAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setHeight(String val) { this.heightAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setType(String val) { this.typeAttribute = val; }
	@Override
	public void setUsemap(String val) { this.usemapAttribute = val; }
	@Override
	public void setWidth(String val) { this.widthAttribute = val; }
	@Override
	public String getAlign() { return this.alignAttribute; }
	@Override
	public String getBorder() { return this.borderAttribute; }
	@Override
	public String getData() { return this.dataAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getHeight() { return this.heightAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getType() { return this.typeAttribute; }
	@Override
	public String getUsemap() { return this.usemapAttribute; }
	@Override
	public String getWidth() { return this.widthAttribute; }
}
