package tiposdedados;

class Motor {
	
}

class Carro {
	int year;
	char firstLetter;
	boolean used;
	Motor motor;
	String marca;
}

public class Test1 {
	
	public static void main(String[] args) {
		
		// Verificando os valores padrões
		
		Carro carro = new Carro();
		
		// O valor padrão de um número inteiro de classe montadora é 0
		System.out.println(carro.year);
		
		// O valor padrão de um caracter de classe montadora é 0
		System.out.println(carro.firstLetter);
		
		// O valor padrão de um boolean  de classe montadora é false
		System.out.println(carro.used);
		
		// O valor padrão de uma referência de classe montadora é null
		System.out.println(carro.motor);
		System.out.println(carro.marca);
		

	}
	
}
