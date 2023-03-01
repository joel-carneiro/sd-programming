public class ExLacos {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < 11; k++) {
                if (k % 7 == 0) {
                    System.out.print("p");
                } else {
                    System.out.print("y");
                }

                System.out.print("");
            }

            System.out.println();
        }
    }
}