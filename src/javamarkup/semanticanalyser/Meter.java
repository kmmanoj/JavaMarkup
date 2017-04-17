package javamarkup.semanticanalyser;
public class Meter extends Tag{
	public Meter(){
		super();
		this.shortClose = false;
		this.tagName = "meter";
	}
	@Override
	public void setForm(String val) { this.formAttribute = val; }
	@Override
	public void setHigh(String val) { this.highAttribute = val; }
	@Override
	public void setLow(String val) { this.lowAttribute = val; }
	@Override
	public void setMax(String val) { this.maxAttribute = val; }
	@Override
	public void setMin(String val) { this.minAttribute = val; }
	@Override
	public void setOptimum(String val) { this.optimumAttribute = val; }
	@Override
	public void setValue(String val) { this.valueAttribute = val; }
	@Override
	public String getForm() { return this.formAttribute; }
	@Override
	public String getHigh() { return this.highAttribute; }
	@Override
	public String getLow() { return this.lowAttribute; }
	@Override
	public String getMax() { return this.maxAttribute; }
	@Override
	public String getMin() { return this.minAttribute; }
	@Override
	public String getOptimum() { return this.optimumAttribute; }
	@Override
	public String getValue() { return this.valueAttribute; }
}
