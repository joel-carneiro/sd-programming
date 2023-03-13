package ComplexNumbers;

public class Complex {
	private double real;
	private double imaginary;
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	@Override
	public String toString() {
		return String.format("(%s, %s)", this.real, this.imaginary);
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
}
