package br.com.screenmatch.menuservice;

import java.util.Scanner;

public class Challenge {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final String nomeDoCliente = "Luan Souza Carosi";
		final String tipoDeConta = "Conta Corrente";
		double saldoDaConta = 2500;
		
		System.out.println("*****************************************");
		System.out.println("\nNome do cliente:\t" + nomeDoCliente);
		System.out.println("Tipo de conta:\t\t" + tipoDeConta);
		System.out.println("Saldo atual:\t\t" + saldoDaConta);
		System.out.println("\n*****************************************");
		
		int operacao = 0;
		final String menu = """
				Escolha uma das operações:
				
				[ 1 ] Ver os dados da conta
				[ 2 ] Transferir saldo da conta
				[ 3 ] Adicionar saldo na conta
				[ 4 ] Sair do menu
				
				Sua operação:""";
		
		while (operacao != 4) {
			System.out.println(menu);
			operacao = scanner.nextInt();
			
			if (operacao == 1) {
				System.out.println("\nO saldo atualizado é: R$ " + saldoDaConta + "\n");
			} else if (operacao == 2) {
				System.out.print("Quanto você quer transferir? ");
				double valor = scanner.nextDouble();
				
				if (valor > saldoDaConta) {
					System.out.println("\nVocê não pode transferir um valor maior que seu saldo.\n");
				} else {
					saldoDaConta = saldoDaConta - valor;
				}
			} else if (operacao == 3) {
				System.out.print("Quanto você quer depositar? ");
				double valor = scanner.nextDouble();
				saldoDaConta = saldoDaConta + valor;
			}
		}
		
		scanner.close();
		System.out.println("Programa encerrado!");
		
		
	}
}
