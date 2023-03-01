package Main;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input your name: ");
		System.out.print("? ");
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name);
		
		scanner.close();
	}
}
