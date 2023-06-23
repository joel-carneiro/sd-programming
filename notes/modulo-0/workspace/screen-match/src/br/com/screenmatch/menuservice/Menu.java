package br.com.screenmatch.menuservice;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Client client = new Client("Francisco Fábio Damasceno", "Corrente", 2500);

		System.out.println("Bem-vindo ao ByteBank!");
		System.out.println("Essa é a conta selecionada: " + client);

		int operation = 0;

		while (operation != 4) {
			MenuService.showOperations();
			operation = input.nextInt();

			switch (operation) {
				case 1:
					System.out.println(client);
					break;
				case 2:
					client.setBalance(client.getBalance() - 10);
					break;
				case 3:
					client.setBalance(client.getBalance() + 10);
					break;
				default:
					System.out.println("ERRO!");
			}

		}

		input.close();

		System.out.println("Menu encerrado!");
	}
}
