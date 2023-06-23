package br.com.alura.init;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainWithoutThreads {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter a funny name to be searched for: ");
		final String name = scanner.nextLine();
		 
		SearchName search1 = new SearchName(name, "names1.txt");
		SearchName search2 = new SearchName(name, "names2.txt");
		SearchName search3 = new SearchName(name, "names3.txt");
		
		search1.searchNameNow();
		search2.searchNameNow();
		search3.searchNameNow();
		
		scanner.close();
	}
}
