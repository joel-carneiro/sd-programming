package Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Login {

	public static void execute() throws Exception {

		AcessDatabase database = new AcessDatabase();
		Connection connection = database.connectTo();

		Scanner input = new Scanner(System.in);

		System.out.print("ID: ");
		String inputID = input.nextLine();
		System.out.print("Password: ");
		String inputPassword = input.nextLine();

		input.close();

		PreparedStatement executable = connection.prepareStatement("SELECT ID, PASSWORD FROM USERS WHERE ID = ?");

		executable.setString(1, inputID);

		executable.execute();

		ResultSet data = executable.getResultSet();
		
		if (data.next())
		{
			String id = data.getString("ID");
			String password = data.getString("PASSWORD");
			System.out.println(id == inputID);
			System.out.println(password == inputPassword);
		}
		
		connection.close();
		
		}
		
		
	}

