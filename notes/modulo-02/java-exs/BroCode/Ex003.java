import java.util.Random;

public class Ex003 {
	public static void main(String[] args) {
		Random random = new Random();

		int number = random.nextInt(6) + 1;

		System.out.println(number);
	}
}
