package Account;

public class Account {

    private double balance;
    
    public Account(double initialBalance) {
        if (initialBalance > 0) balance = initialBalance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }



    // Setters e Getters

    public double getBalance() {
        return balance;
    }
}
