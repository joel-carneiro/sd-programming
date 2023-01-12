public class Notes {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setBalance(200);

        try {
            c.debit(202);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}