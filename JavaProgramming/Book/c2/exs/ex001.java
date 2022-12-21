package exs;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;

        System.out.print("Insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextDouble();

        System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
        System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
        System.out.printf("%s * %s = %s\n", num1, num2, num1 * num2);
        System.out.printf("%s / %s = %s\n", num1, num2, num1 / num2);
        input.close();
    }
}
