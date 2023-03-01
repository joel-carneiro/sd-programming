package Curso1;

public class Teste {
	
	String name = "William Martins Dabruzzo";
	
	public void m1() {
		System.out.println("Método 1: " + name);
	}
	
	public void m2() {
		System.out.println("Método 2: " + name);
	}
	
	public static void main(String[] args) {
		Teste t = new Teste();
		
		t.m1();
		
		t.m2();
		
		System.out.println("Método Main: " + t.name);
	}
}
