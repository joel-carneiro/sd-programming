package br.com.alura.bytebank.services;

import java.sql.SQLException;
import java.util.Set;

import br.com.alura.bytebank.models.Client;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		ClientService clientService = new ClientService();
		clientService.updateYear(new Client("Luan Souza Carosi", "66666666666", 24));
	}

}
