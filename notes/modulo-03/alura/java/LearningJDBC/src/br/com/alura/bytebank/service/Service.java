package br.com.alura.bytebank.service;

import java.sql.SQLException;

import br.com.alura.bytebank.models.Client;

public class Service {
	public static void main(String[] args) throws SQLException {
		System.out.println("Bem-vindo ao bytebank, vamos registrar seu cadastro.");
		
		ConnectionFactory connectionFactory = new ConnectionFactory("bytebank", "joeldspy", "databyjupyter");
		MySQLConnection.connection = connectionFactory.getConnection();
		
		Client client = ClientService.registerClient();
		
		MySQLConnection.saveClient(client);
	}
}
