package Util;

public class TesteWrappers {
    public static void main(String[] args) {

        Integer intNumber = Integer.valueOf(77); // Autoboxing
        System.out.println(intNumber.intValue()); // Unboxing

        Double doubleNumber = Double.valueOf(77.44); // Autoboxing
        System.out.println(doubleNumber.doubleValue()); // Unboxing

        Boolean booleanValue = Boolean.FALSE; // Autoboxing
        System.out.println(booleanValue.booleanValue()); // Unboxing

    }
}
