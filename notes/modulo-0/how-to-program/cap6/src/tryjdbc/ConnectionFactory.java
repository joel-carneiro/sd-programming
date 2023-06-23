package tryjdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getConnection() throws SQLException, IOException {
		
		Properties properties = ConnectionFactory.getProperties();
		
		final String URL = properties.getProperty("url");
		final String USER = properties.getProperty("user");
		final String PASSWORD = properties.getProperty("password");
		
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public static Properties getProperties() throws IOException {
		Properties properties = new Properties();
		String arquivePath = "/data.properties";
		
		properties.load(ConnectionFactory.class.getResourceAsStream(arquivePath));
		
		return properties;
	}
}
