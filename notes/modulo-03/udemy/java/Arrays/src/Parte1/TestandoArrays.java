package Parte1;

import java.util.Arrays;

public class TestandoArrays {

	public static void main(String[] args) {

		double[] ages = { 1.68, 1.69, 1.73, 1.74, 1.75, 1.76, 1.77, 1.89 };

		double total = 0;
		for (double age : ages) {
			total = total + age;
		}
		
		System.out.printf("Média das alturas: %.2f", total / ages.length);

	}

}
