package tiposdedados;

class Calculator {
	
	public int sum(int... numbers) {
		
		int soma = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			soma = soma + numbers[i];
		}
		
		return soma;
		
	}
	
}

public class Test5 {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.sum(3, 5, 10, 3, 2, 3, 4));
		
	}

}
