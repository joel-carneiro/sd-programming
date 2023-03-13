package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AcessDatabase {
	
	public Connection connectTo() throws SQLException {

		String url = "jdbc:mysql://localhost/SCHOOLSYSTEM?useTimezone=True&serverTimezone=UTC";
		String user = "root";
		String password = "********";
		
		return DriverManager.getConnection(url, user, password);
	}

}
