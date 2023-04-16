package parte2;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Por favor, informe a média do aluno: ");
		double mean = input.nextDouble();

		if (mean > 6) {
			System.out.println("Parabéns, aluno aprovado!");
		} else {
			System.out.println("Que pena, aluno reprovado.");
		}

	}

}
