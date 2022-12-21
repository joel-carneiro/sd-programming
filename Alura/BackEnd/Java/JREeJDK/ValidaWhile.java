public class ValidaWhile {
    public static void main(String[] args) {
        int contador = 1;
        int total = 0;
        while (contador <= 100) {
            System.out.println(contador);
            total += contador;

            contador++;

        }

        System.out.println(contador);
        System.out.println(total);
    }
}
