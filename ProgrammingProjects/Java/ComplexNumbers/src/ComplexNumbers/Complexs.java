package ComplexNumbers;

public class Complexs {
	
	public static Complex add(Complex c1, Complex c2) {
		double real = c1.getReal() + c2.getReal();
		double imaginary = c1.getImaginary() + c2.getImaginary();
		
		return new Complex(real, imaginary);
	}
	
	public static Complex multiply(Complex c1, Complex c2) {
		double real = c1.getReal() * c2.getReal() + (c1.getImaginary() * c2.getImaginary()) * -1;
		double imaginary = c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal();
		
		return new Complex(real, imaginary);
	}
	
}
