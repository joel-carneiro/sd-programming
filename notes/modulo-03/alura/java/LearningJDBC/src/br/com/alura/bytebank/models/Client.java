package br.com.alura.bytebank.models;

public class Client {
	
	private String name;
	private String cpf;
	private int age;
	
	public Client(String name, String cpf, int age) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s", name, cpf, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
