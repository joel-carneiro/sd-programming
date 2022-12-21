package Account;

public class SavingsAccount extends Account {
    
    public SavingsAccount(Client holder, double balance, String accountNumber) {
        super(holder, balance, accountNumber);
    }

    public boolean draw(double value) {
        if (super.balance >= value) {
            super.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account account, double value) {
        if (super.balance >= value) {
            this.draw(value);
            account.deposit(value);
            return true;
        } else {
            return false;
        }
    }
}

