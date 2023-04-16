package Parte1;

public class ConceitoIgualdade {
	
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Pierre de Fermat";
		u1.email = "fermat.pierre@example.com.br";
		
		User u2 = new User();
		u2.name = "Pierre de Fermat";
		u2.email = "fermat.pierre@example.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	}

}
