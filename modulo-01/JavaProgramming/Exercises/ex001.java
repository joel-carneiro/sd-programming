/* Write a Java program to print the area and perimeter of a circle. */

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area, perimetro, raio;
        double pi = Math.PI;

        System.out.print("Digite o RAIO do círculo: ");
        raio = input.nextDouble();

        area = Math.pow(raio, 2) * pi;
        perimetro = 2 * pi * raio;

        System.out.printf("Área: %s -=- Perimetro: %s\n", area, perimetro);

        input.close();
    }
}