package Login;
		
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {
	
	public static void execute() throws SQLException {
		
		AcessDatabase database = new AcessDatabase();
		Connection connection = database.connectTo();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: "); String name = input.nextLine();
		System.out.print("Password: "); String password = input.nextLine();
		System.out.print("Hierarquy: "); String hierarquy = input.nextLine();
		input.close();
		
		User user = new User(name, password, hierarquy);
		
		PreparedStatement executable = connection.
				prepareStatement("INSERT INTO USERS (NAME, ID, PASSWORD, HIERARCHY) VALUES (?, ?, ?, ?)");
		
		executable.setString(1, user.getName());
		executable.setString(2, user.getId());
		executable.setString(3, user.getPassword());
		executable.setString(4, user.getHierarquy());
		
		executable.execute();
		
		System.out.println("User " + user.getName() +  " created successfully, ID: " + user.getId());
		
		connection.close();
		
	}
}
