public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Error | ArithmeticException ex) {
            // String msg = ex.getMessage(); [ RETORNA A MENSAGEM DA EXCEÇÃO => / BY ZERO]
            // ex.printStackTrace();  [ IMPRIME A EXCEÇÃO COM LINKS E LINHAS DE ERROR ]

            String msg = ex.getMessage();
            System.out.println(msg);
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            // int number = i / 0;
                                
            // Conta c = null;
            // c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}