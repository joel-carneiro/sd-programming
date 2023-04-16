package parte1;

public class Console {
	
	public static void main(String[] args) {
		
		String fermat = "Pierre de Fermat";
		String willis = "Andrew Wilis";
		int year = 2003;
		
		System.out.println("O último de " + fermat + " foi demonstrado por " + willis + " no ano de " + year);
		
		System.out.printf("O último de %s foi demonstrado por %s no ano de %d", fermat, willis, year);
	}
	
}
