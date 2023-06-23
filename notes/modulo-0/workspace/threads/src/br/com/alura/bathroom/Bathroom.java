package br.com.alura.bathroom;

public class Bathroom {

	public void numberOne() {
		
		String guest = Thread.currentThread().getName();
		
		System.out.println(guest + " está entrando no banheiro.");
		System.out.println(guest + " está utilizando o banheiro.");
		
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			System.out.println("Infelizmente ocorreu um erro.");
		}
		
		System.out.println(guest + " está dando descarga.");
		System.out.println(guest + " está lavando a mão.");
		System.out.println(guest + " está saindo do banheiro.");
	}

	public void numberTwo() {
		
		String guest = Thread.currentThread().getName();
		
		System.out.println(guest + " está entrando no banheiro.");
		System.out.println(guest + " está utilizando o banheiro.");
		
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			System.out.println("Infelizmente ocorreu um erro.");
		}
		
		
		System.out.println(guest + " está dando descarga.");
		System.out.println(guest + " está lavando a mão.");
		System.out.println(guest + " está saindo do banheiro.");
	}

}
