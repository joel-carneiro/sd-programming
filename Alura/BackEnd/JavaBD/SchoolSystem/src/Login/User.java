package Login;

import java.security.SecureRandom;

public class User {
	
	String name;
	String password;
	String id;
	String hierarquy;
	
	public User(String name, String password, String hierarquy) {
		this.name = name;
		this.password = password;
		this.hierarquy = hierarquy;
		
		SecureRandom randomNumber = new SecureRandom();
		
		this.id = String.format("%06d", randomNumber.nextInt(999999));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getHierarquy() {
		return hierarquy;
	}
	
	public void setHierarquy(String hierarquy) {
		this.hierarquy = hierarquy;
	}
	
	

}
