package ComplexNumbers;

import java.util.Scanner;

public class MainComplex {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a first complex: ");
		System.out.print("? ");
		double real1 = input.nextDouble();
		System.out.print("? ");
		double imaginary1 = input.nextDouble();
		
		System.out.println("Input a second complex: ");
		System.out.print("? ");
		double real2 = input.nextDouble();
		System.out.print("? ");
		double imaginary2 = input.nextDouble();
		
		Complex c1 = new Complex(real1, imaginary1);
		Complex c2 = new Complex(real2, imaginary2);
		
		Complex sumComplex = Complexs.add(c1, c2);
		Complex multiplyComplex = Complexs.multiply(c1, c2);
		
		System.out.println(sumComplex);
		System.out.println(multiplyComplex);
	}
	
}
