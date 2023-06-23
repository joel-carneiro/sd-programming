package br.com.alura.init;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a funny name to be searched for: ");
		final String name = scanner.nextLine();
		 
		Thread searchThread1 = new Thread(new SearchName(name, "names1.txt"), "Search 01");
		Thread searchThread2 = new Thread(new SearchName(name, "names2.txt"), "Search 02");
		Thread searchThread3 = new Thread(new SearchName(name, "names3.txt"), "Search 03");
		
		searchThread1.start();
		searchThread2.start();
		searchThread3.start();
		
		scanner.close();
	}
}
