package Tipo2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			
			String[] values = line.split(",");
			System.out.println(Arrays.toString(values));
		}
		
		scanner.close();
	}
}
