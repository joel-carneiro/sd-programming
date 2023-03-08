package Login;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Choose what you want:");
		System.out.println("[ 1 ] Login");
		System.out.println("[ 2 ] Register");
		System.out.print("? ");
		
		try (Scanner input = new Scanner(System.in)) {
			int OPTION = input.nextInt();
			
			if (OPTION == 2)
				Register.execute();
			
			else if (OPTION == 1)
				Login.execute();
			
		} catch (Exception e) {
			System.out.println("CHOICE INSERT ERROR");
			System.exit(1);
		} 
		
	}

}
