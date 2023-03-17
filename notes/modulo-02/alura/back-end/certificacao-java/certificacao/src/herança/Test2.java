package herança;

class Veiculo {
	
	public void ligar() {
		System.out.println("Veículo está ligando...");
	}
	
}

class Helicoptero extends Veiculo {
	
	public void ligar() {
		System.out.println("Helicóptero está ligando...");
	}
	
}

public class Test2 {
	
	public static void main(String[] args) {
		
		Veiculo h1 = new Helicoptero();
		
		h1.ligar();
		
	}

}
