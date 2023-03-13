package Util;

// import java.util.ArrayList;
// import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer number = Integer.valueOf(50); // De primitivo pra para objeto : Autoboxing;

        int value = number.intValue(); // De objeto para primitivo : Unboxing;

        String price = "35050";

        int intPrice = Integer.parseInt(price); // Método estático para passar de String para int;

        System.out.println(Integer.MAX_VALUE); // O maior valor para inteiros

        System.out.println(value);
        System.out.println(intPrice);
    }
}
