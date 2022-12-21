public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1250.50;
		int valor = (int) salario;
		
		System.out.println("Salário = " + valor);
		
		long number = 2000000000000000000L;
		short numberPequeno = 2131;
		byte b = 127;
		
		System.out.println(b + numberPequeno + number);
	}
}
