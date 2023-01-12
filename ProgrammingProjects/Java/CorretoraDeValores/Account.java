import java.util.ArrayList;

public class Account {
    private String holder;
    private double balance;
    private double patrimony;
    public ArrayList<Investiment> listOfInvestiments;

    // Constructor

    public Account(String name, double balance) {
        this.holder = name;
        this.balance = balance;
        this.patrimony = balance;
    }

    // Methods

    public void buyInvestiment(Investiment inv) {
        this.listOfInvestiments.add(inv);
    }

    public void attPatrimony() {

        double sum = 0;

        for (Investiment inv: this.listOfInvestiments) {
            sum += inv.price;
        }

        this.patrimony = balance + sum;

    }

    // Override

    @Override
    public String toString() {
        return this.holder;
    }
    // Getters and Settersr

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public double getPatrimony() {
        this.attPatrimony();
        return patrimony;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setHolder(String name) {
        this.holder = name;
    }

    public void setPatrimony(double patrimony) {
        this.patrimony = patrimony;
    }

    public ArrayList<Investiment> getListOfInvestiments() {
        return listOfInvestiments;
    }

    public void setListOfInvestiments(ArrayList<Investiment> listOfInvestiments) {
        this.listOfInvestiments = listOfInvestiments;
    }


}