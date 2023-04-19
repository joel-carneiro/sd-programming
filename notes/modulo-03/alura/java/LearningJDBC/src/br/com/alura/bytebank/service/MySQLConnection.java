package br.com.alura.bytebank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.alura.bytebank.models.Client;

public class MySQLConnection {
	
	static Connection connection;
	
	public MySQLConnection(Connection connection) {
		MySQLConnection.connection = connection;
	}

	public static void saveClient(Client client) throws SQLException {

		String statementSQL = "INSERT INTO clients (name, cpf, cep, city, state, age, isMarried) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement preparedStatement = connection.prepareStatement(statementSQL);
		
		preparedStatement.setString(1, client.getName());
		
		preparedStatement.setString(2, client.getCpf());
		
		preparedStatement.setString(3, client.getCep());
		
		preparedStatement.setString(4, client.getCity());
		
		preparedStatement.setString(5, client.getState());
		
		preparedStatement.setInt(6, client.getAge());
		
		preparedStatement.setBoolean(7, client.isMarried());

		preparedStatement.execute();
	}
}
