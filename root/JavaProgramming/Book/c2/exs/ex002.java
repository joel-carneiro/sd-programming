package exs;
import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.print("Insira o primeiro número: ");
        num1 = input.nextDouble();
        System.out.print("Insira o segundo número: ");
        num2 = input.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro é maior!");
        }

        if (num1 < num2) {
            System.out.println("O segundo é maior!");
        }

        if (num1 == num2) {
            System.out.println("São iguais!");
        }

        input.close();
    }
}
