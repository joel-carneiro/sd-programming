import java.security.SecureRandom;

public class Acction extends Investiment {

    public Acction(double price) {
        super.price = price;
    }

    public void passYear(int years) {

        while (years != 0) {
            SecureRandom random = new SecureRandom();

        if (random.nextBoolean())
            super.rateOnYear = random.nextDouble() / 3;
        else 
            super.rateOnYear = random.nextDouble() / -3;
        
        super.price += super.price * rateOnYear;

        years -= 1;

        }
    }

}