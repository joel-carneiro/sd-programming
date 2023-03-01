package Variables;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("Hello Bro, " + name);
		
		scanner.close();
	}
}
