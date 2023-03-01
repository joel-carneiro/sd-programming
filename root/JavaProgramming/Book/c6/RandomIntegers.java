import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int randomValue = randomNumbers.nextInt(6);

        System.out.println(randomValue);
    }
}