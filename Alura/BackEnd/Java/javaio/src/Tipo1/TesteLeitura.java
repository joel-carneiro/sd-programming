package Tipo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println(br.readLine());
		
		br.close();
	}
}
