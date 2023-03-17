package arrays;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] pares = new int[5];
		
		for (int i = 0; i < pares.length; i++) {
			pares[i] = i * 2;
		}
		
		for (int numero : pares) {
			System.out.println(numero);
		}
		
		
	}

}
