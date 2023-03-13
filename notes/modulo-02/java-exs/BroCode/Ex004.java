import java.util.Scanner;

public class Ex004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input your age: ");
		int age = scanner.nextInt();

		if (age == 75) {
			System.out.println("Ok Boomer.");
		}

		else if (age >= 18) {
			System.out.println("You are a adult");
		}

		else if (age >= 13) {
			System.out.println("You are a teeneger");
		}

		else {
			System.out.println("You are a children");
		}
	}
}