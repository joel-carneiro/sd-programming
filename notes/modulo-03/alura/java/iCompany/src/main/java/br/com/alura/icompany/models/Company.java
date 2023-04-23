package br.com.alura.icompany.models;

public class Company {
	String name;
	String CNPJ;

	public Company(String name, String cNPJ) {
		super();
		this.name = name;
		CNPJ = cNPJ;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", name, CNPJ);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
