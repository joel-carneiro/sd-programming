package br.com.alura.bytebank.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(String database, String user, String password) throws SQLException {

		String url = String.format("jdbc:mysql://localhost:3306/%s?user=%s&password=%s", database, user, password);
		return DriverManager.getConnection(url);
	}

}
