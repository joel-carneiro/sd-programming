/* Write a Java program to compute the distance between two points on the surface of earth. */

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* Input the latitude of coordinate 1: 25
            Input the longitude of coordinate 1: 35
            Input the latitude of coordinate 2: 35.5
            Input the longitude of coordinate 2: 25.5 */

        System.out.println("Input the latitude of coordinate 1");
        double x1 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 1");
        double y1 = input.nextDouble();
        System.out.println("Input the latitude of coordinate 2");
        double x2 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 2");
        double y2 = input.nextDouble();

        double distancia = calculaDistanciaEntreDoisPontos(x1, y1, x2, y2);

        System.out.printf("Distância: %s\n", distancia);

        input.close();
    }

    public static double calculaDistanciaEntreDoisPontos(double x1, double y1,  double x2, double y2) {
        double raioDaTerra = 6371.01;
        double distancia = raioDaTerra * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) 
        * Math.cos(y1 - y2));
        return distancia;
    }
}
