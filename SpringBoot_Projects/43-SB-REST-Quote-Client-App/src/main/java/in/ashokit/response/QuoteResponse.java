package in.ashokit.response;

public class QuoteResponse {

	private String type;
	private Value value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "QuoteResponse [type=" + type + ", value=" + value + "]";
	}

}
