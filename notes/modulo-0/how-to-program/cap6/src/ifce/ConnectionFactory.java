package ifce;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	public static Connection getConnection() throws IOException, SQLException {
		Properties properties = ConnectionFactory.getProperties();

		final String URL = properties.getProperty("url");
		final String USER = properties.getProperty("user");
		final String PASSWORD = properties.getProperty("password");

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public static Properties getProperties() throws IOException {
		Properties properties = new Properties();
		final String arquivePath = "/ifce.properties";

		properties.load(ConnectionFactory.class.getResourceAsStream(arquivePath));

		return properties;
	}
	
}
