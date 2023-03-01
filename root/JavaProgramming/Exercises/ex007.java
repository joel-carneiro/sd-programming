import java.util.Scanner;

/* Write a Java program to get a number from the user and print whether it is positive or negative.  */

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        double number = input.nextDouble();

        if (number > 0) System.out.println("is positive");
        else if (number < 0) System.out.println("is negative");
        else System.out.println("is null");

        input.close();
    }
}