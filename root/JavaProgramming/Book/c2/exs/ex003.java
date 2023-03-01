package exs;

public class ex003 {
    public static void main(String[] args) {
        for (int coluna = 0; coluna < 10; coluna++) {
            for (int linha = 0; linha < 20; linha++) {
                if (linha != 20 && coluna % 3 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
