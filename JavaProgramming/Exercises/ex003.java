/* Write a Java program to print the area and perimeter of a rectangle. */

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura, largura, area, perimetro;
        
        System.out.print("Altura: ");
        altura = input.nextDouble();
        System.out.print("Largura: ");
        largura = input.nextDouble();

        area = altura * largura;
        perimetro = (altura * 2) + (largura * 2);

        System.out.printf("Área: %s -=- Perímetro: %s\n", area, perimetro);

        input.close();
    }
}
