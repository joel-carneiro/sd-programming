public class CondicionalDois {
	public static void main(String[] args) {
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 1;
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo!");
		}
		
		else {
			System.out.println("Infelizmente você não pode entrar =(");
		}
	}
}
