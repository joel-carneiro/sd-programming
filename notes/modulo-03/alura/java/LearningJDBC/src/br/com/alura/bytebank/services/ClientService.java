package br.com.alura.bytebank.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.mysql.cj.protocol.Resultset;

import br.com.alura.bytebank.models.Client;

public class ClientService {
	
	Connection connection;
	
	public ClientService() throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		this.connection = connectionFactory.getConnection("bytebank", "joeldspy", "databyjupyter");
	}
	
	public Client registerClient() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		String name = scanner.nextLine();
		
		System.out.print("CPF do cliente: ");
		String cpf = scanner.nextLine();
		
		System.out.print("Idade do cliente: ");
		int age = scanner.nextInt();
		
		return new Client(name, cpf, age);
	}
	
	public void saveClient(Client c) throws SQLException {
		String sql = "INSERT INTO clients (name, cpf, age) VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, c.getName());
		preparedStatement.setString(2, c.getCpf());
		preparedStatement.setInt(3, c.getAge());
		
		preparedStatement.execute();
	}
	
	public Set<Client> listCustomers() throws SQLException {
		
		Set<Client> clients = new HashSet<>();
		
		String sql = "SELECT * FROM clients";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		ResultSet resultset = preparedStatement.executeQuery();
		
		while (resultset.next()) {
			String name = resultset.getString(1);
			String cpf = resultset.getString(2);
			int age = resultset.getInt(3);
			
			clients.add(new Client(name, cpf, age));
		}
		
		return clients;
	}
	
	public void updateYear(Client c) throws SQLException {
		String sql = "UPDATE clients SET age = ? WHERE cpf = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, c.getAge() + 1);
		preparedStatement.setString(2, c.getCpf());
		
		preparedStatement.execute();
	}

}
