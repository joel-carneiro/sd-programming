package br.com.alura.bytebank.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	String database;
	String user;
	String password;

	public ConnectionFactory(String database, String user, String password) {
		super();
		this.database = database;
		this.user = user;
		this.password = password;
	}

	public Connection getConnection() {
		try {
			String url = String.format("jdbc:mysql://localhost:3306/%s?user=%s&password=%s", database, user, password);
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
