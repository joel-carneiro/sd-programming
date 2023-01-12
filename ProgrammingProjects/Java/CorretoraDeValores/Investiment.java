public abstract class Investiment {
    private String name;
    protected double price;
    protected double rateOnYear;

    public abstract void passYear(int years);

    // Getters and Setters

    public double getPrice() {
        return price;
    }

    public double getRateOnYear() {
        return rateOnYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRateOnYear(double rateOnYear) {
        this.rateOnYear = rateOnYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}