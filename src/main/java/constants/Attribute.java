package constants;

public enum Attribute {
	
	MAX_LENGTH("maxlength"),
	INNER_HTML("innerHTML");
	
	String attribute;
	private Attribute(String attriute) {
		this.attribute =attriute;
	}
	public String getAttributes() {
		return attribute;
	}
	@Override
	public String toString() {
		return attribute;
		
	}
}
