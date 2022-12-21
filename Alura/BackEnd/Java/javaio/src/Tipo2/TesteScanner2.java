package Tipo2;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("? ");
			input.useLocale(Locale.ENGLISH);
			double number = input.nextDouble();
			
			System.out.println(number / 2);
		}
	}
}
