package br.com.nubank.entity;

import java.math.BigDecimal;
import java.util.Scanner;

public class ClientManager {
	
	public static Client getClientData() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("NOME COMPLETO DO CLIENTE: ");
			String name = scanner.nextLine().toUpperCase();
			
			System.out.print("TOTAL DE DÉBITO: ");
			BigDecimal balance = new BigDecimal(scanner.nextLine()) ;
			
			return new Client(name, balance);
		}
	}
}