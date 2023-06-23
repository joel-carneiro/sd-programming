package br.com.screenmatch.menuservice;

public class Client {
	
	private String fullName;
	private String accountType;
	private double balance;
	
	public Client(String fullName, String accountType, double balance) {
		this.fullName = fullName;
		this.accountType = accountType;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("%s : R$ %s", this.fullName, this.balance);
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
