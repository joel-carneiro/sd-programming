/* Write a Java program and compute the sum of the digits of an integer. */
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;

        System.out.print("Digite um inteiro: ");
        num1 = input.nextInt();

        int sum = somaDigitos(num1);
       
        System.out.printf("A soma dos números é: %d\n", sum);

        input.close();
    }

    public static int somaDigitos(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
