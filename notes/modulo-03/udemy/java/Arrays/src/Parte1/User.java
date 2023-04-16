package Parte1;

public class User {
	String name;
	String email;
	
	public boolean equals(Object obj) {
		
		if (obj instanceof User) {
			User oter = (User) obj;
			return oter.email.equals(this.email);
		}
		
		return false;
		
	}
	
}
