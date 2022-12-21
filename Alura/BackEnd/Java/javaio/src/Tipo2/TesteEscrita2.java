package Tipo2;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream("output.txt");
		
		for (int i = 0; i < 100; i++) {
			ps.println(i);
		}
		
		System.out.println("Finish");
		
		ps.close();
	}
}
