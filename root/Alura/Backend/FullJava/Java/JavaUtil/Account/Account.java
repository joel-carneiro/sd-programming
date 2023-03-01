package Account;

public abstract class Account extends Object implements Comparable<Account> {
    Client holder;
    double balance;
    String accountNumber;

    // Constructor

    public Account(Client holder, double balance, String accountNumber) {
        this.holder = holder;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Abstract methods

    public abstract boolean draw(double value);

    public abstract boolean transfer(Account account, double value);

    // Methods

    public void deposit(double value) {
        this.balance += value;
    }

    // Override

    @Override
    public boolean equals(Object ref) {

        Account account = (Account) ref;

        return account.accountNumber == this.accountNumber;
    }

    @Override
    public String toString() {
        return this.accountNumber;
    }
    
    @Override
    public int compareTo(Account account) {
        return Double.compare(this.balance, account.balance);
    }

    // Getters and Setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Client getHolder() {
        return holder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setHolder(Client holder) {
        this.holder = holder;
    }
}