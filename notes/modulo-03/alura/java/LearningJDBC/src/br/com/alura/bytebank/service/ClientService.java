package br.com.alura.bytebank.service;

import java.util.Scanner;

import br.com.alura.bytebank.models.Client;

public class ClientService {

	public static String getInfo(String txt) {
		Scanner scanner = new Scanner(System.in);
			System.out.print(txt);

			return scanner.nextLine();
	}

	public static Client registerClient() {

		String name = getInfo("Por favor, nós diga seu nome: ");
		String cpf = getInfo("Seu CPF: ");
		String cep = getInfo("Seu CEP: ");
		String city = getInfo("Sua cidade: ");
		String state = getInfo("Seu estado: ");
		int age = Integer.parseInt(getInfo("Sua idade: "));
		boolean isMarried = Boolean.parseBoolean(getInfo("Você é casado: "));

		return new Client(name, cpf, cep, city, state, age, isMarried);
	}

}
