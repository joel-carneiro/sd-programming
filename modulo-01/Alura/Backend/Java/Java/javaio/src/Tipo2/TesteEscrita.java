package Tipo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw =
				new BufferedWriter(new FileWriter("output.txt"));
		
		bw.write("Hello, i am programming Java.");
		
		bw.close();
		
		System.out.println("Finish.");
//		FileWriter fw = new FileWriter("output.txt");
//		fw.write("100 Bob Blue");
//		fw.write(System.lineSeparator());
//		fw.write("200 Jim Jayn");
//		
//		fw.close();
	}
}
