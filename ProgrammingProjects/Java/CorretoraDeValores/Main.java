public class Main {
    public static void main(String[] args) {
        Acction a1 = new Acction(500);
        Acction a2 = new Acction(400);
        Acction a3 = new Acction(300);

        Account william = new Account("William", 200);
        william.buyInvestiment(a3);
        william.buyInvestiment(a2);
        william.buyInvestiment(a1);

        System.out.println(william.getPatrimony());
    }
}