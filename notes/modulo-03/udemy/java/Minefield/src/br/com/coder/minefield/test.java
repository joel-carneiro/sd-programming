package br.com.coder.minefield;

import java.util.Random;

public class test {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for (int i = 0; i < 10; i++)
			System.out.println(random.nextInt(2));
		
	}

}
