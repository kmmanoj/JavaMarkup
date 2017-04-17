package javamarkup.semanticanalyser;
public class Form extends Tag{
	public Form(){
		super();
		this.shortClose = false;
		this.tagName = "form";
	}
	@Override
	public void setAccept(String val) { this.acceptAttribute = val; }
	@Override
	public void setAcceptCharset(String val) { this.acceptCharsetAttribute = val; }
	@Override
	public void setAction(String val) { this.actionAttribute = val; }
	@Override
	public void setAutocomplete(String val) { this.autocompleteAttribute = val; }
	@Override
	public void setEnctype(String val) { this.enctypeAttribute = val; }
	@Override
	public void setMethod(String val) { this.methodAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public void setNovalidate(String val) { this.novalidateAttribute = val; }
	@Override
	public void setTarget(String val) { this.targetAttribute = val; }
	@Override
	public String getAccept() { return this.acceptAttribute; }
	@Override
	public String getAcceptCharset() { return this.acceptCharsetAttribute; }
	@Override
	public String getAction() { return this.actionAttribute; }
	@Override
	public String getAutocomplete() { return this.autocompleteAttribute; }
	@Override
	public String getEnctype() { return this.enctypeAttribute; }
	@Override
	public String getMethod() { return this.methodAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
	@Override
	public String getNovalidate() { return this.novalidateAttribute; }
	@Override
	public String getTarget() { return this.targetAttribute; }
}
