import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2, sum;

        System.out.print("Primeiro número: ");
        number1 = input.nextInt();
        System.out.print("Segundo número: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("%d + %d = %d \n", number1, number2, sum);

        input.close();

    }
}
