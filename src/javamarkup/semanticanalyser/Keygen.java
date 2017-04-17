package javamarkup.semanticanalyser;
public class Keygen extends Tag{
	public Keygen(){
		super();
		this.shortClose = false;
		this.tagName = "keygen";
	}
	@Override
	public void setAutofocus(String val) { this.autofocusAttribute = val; }
	@Override
	public void setChallenge(String val) { this.challengeAttribute = val; }
	@Override
	public void setDisabled(String val) { this.disabledAttribute = val; }
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setKeytype(String val) { this.keytypeAttribute = val; }
	@Override
	public void setName(String val) { this.nameAttribute = val; }
	@Override
	public String getAutofocus() { return this.autofocusAttribute; }
	@Override
	public String getChallenge() { return this.challengeAttribute; }
	@Override
	public String getDisabled() { return this.disabledAttribute; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getKeytype() { return this.keytypeAttribute; }
	@Override
	public String getName() { return this.nameAttribute; }
}
