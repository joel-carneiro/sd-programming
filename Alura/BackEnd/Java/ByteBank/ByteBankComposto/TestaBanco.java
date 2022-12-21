public class TestaBanco {
    public static void main(String[] args) {
        Cliente paulo = new Cliente("João Paulo", "222.222.333-30", "dev Java");
        Conta contaDoPaulo = new Conta(1275, 73, 60930, paulo);

        Cliente william = new Cliente("Willam Rui", "222.222.333-30", "Dev Python");
        Conta contaDoWilliam = new Conta(1275, 73, 60930, william);

        Cliente carosi = new Cliente("Carosi Paulo", "222.222.333-30", "Dev Nodejs");
        Conta contaDoCarosi = new Conta(1275, 73, 60930, carosi);
        
        System.out.println(contaDoCarosi);
        System.out.println(contaDoWilliam);
        System.out.println(contaDoPaulo);
    }
}
