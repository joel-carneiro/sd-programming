public class Conta {
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void debit(double value) throws MyException {
        if (value > this.balance) throw new MyException("Não há saldo suficiente.");
        else this.balance -= value;
    }
}
