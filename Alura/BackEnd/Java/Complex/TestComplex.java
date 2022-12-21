public class TestComplex {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(2, 4);

        c1.complexAdd(c2);

        System.out.println(c1.getComplex());
    }
}
