import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = input.nextDouble();

        System.out.print("Input y: ");
        double y = input.nextDouble();

        double h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.print("Hipotenuse is " + h);

        System.out.println();
        input.close();
    }
}