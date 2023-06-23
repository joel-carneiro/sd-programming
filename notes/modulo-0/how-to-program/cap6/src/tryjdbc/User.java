package tryjdbc;

public class User {
	private int code;
	private String name;

	public User(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("%s:%s", this.code, this.name);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
