package br.com.alura.bytebank.models;

public class Client {
	
	private String name;
	private String cpf;
	private String cep;
	private String city;
	private String state;
	private int age;
	private boolean isMarried;
	
	public Client(String name, String cpf, String cep, String city, String state, int age, boolean isMarried) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.cep = cep;
		this.city = city;
		this.state = state;
		this.age = age;
		this.isMarried = isMarried;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %d", name, cpf, cep, city, state, age);
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
