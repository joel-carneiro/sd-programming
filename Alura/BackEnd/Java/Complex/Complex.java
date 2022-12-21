public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    private double module =
        Math.sqrt( Math.pow(real, 2) + Math.pow(imaginary, 2) );

    private double angle =
        Math.asin( imaginary / module );

    // Métodos

    public void complexAdd(Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void complexSub(Complex number) {
        this.real -= number.real;
        this.imaginary -= number.imaginary;
    }

    // Getters

    public String getComplex() {
        return String.format("%s + %sj", real, imaginary);
    }

    public double getAngle() {
        return angle;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getModule() {
        return module;
    }

    public double getReal() {
        return real;
    }
}