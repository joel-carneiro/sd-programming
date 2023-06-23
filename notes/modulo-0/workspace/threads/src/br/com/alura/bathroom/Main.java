package br.com.alura.bathroom;

public class Main {
	public static void main(String[] args) {
		
		Bathroom bathroom = new Bathroom();
		
		Thread guestOne = new Thread(new NumberOne(bathroom), "Henrique");
		Thread guestTwo = new Thread(new NumberOne(bathroom), "William");
		
		guestOne.run();
		guestTwo.run();
		
	}
}
