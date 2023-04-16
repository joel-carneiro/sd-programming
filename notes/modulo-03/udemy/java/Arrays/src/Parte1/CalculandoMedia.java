package Parte1;

import java.util.Scanner;

public class CalculandoMedia {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quantas notas você deseja informar? ");
		int notesLen = input.nextInt();

		double[] notes = new double[notesLen];

		for (int i = 0; i < notes.length; i++) {
			System.out.printf("%d° Nota: ", i + 1);
			double note = input.nextDouble();
			notes[i] = note;
		}
		
		double total = 0;
		
		for (double note : notes) {
			total = total + note;
		}
		
		System.out.printf("A média final é: %.2f", total / notes.length);
		
		input.close();
	}

}
