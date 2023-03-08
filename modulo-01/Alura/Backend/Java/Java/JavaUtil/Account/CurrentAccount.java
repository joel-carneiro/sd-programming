package Account;

public class CurrentAccount extends Account {

    private double rate = 7.5;
    
    public CurrentAccount(Client holder, double balance, String accountNumber, double rate) {
        super(holder, balance, accountNumber);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


    public boolean draw(double value) {
        if (value <= super.balance + rate) {
            super.balance = super.balance - value + this.rate;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account account, double value) {
        
        if (this.balance >= value + this.rate) {
            this.draw(value + this.rate);
            account.deposit(value);
            return true;
        } else {
            return false;
        }
    }

}
