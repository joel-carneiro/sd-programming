package tiposdedados;

class Objeto {
	int value;
}

public class Test3 {
	public static void main(String[] args) {
		
		// Duas variáveis que apontam para o mesmo objeto
		
		Objeto o1 = new Objeto();
		Objeto o2 = o1;
		
		o1.value = 3;
		
		System.out.println(o2.value);
	}
}
