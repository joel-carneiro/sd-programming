public class TestaIR {
    public static void main(String[] args) {
        double salario = 4700.00;

        if (salario > 1900 && salario <= 2800) {
            System.out.println("Imposto de Renda: 7,5% ");
        } 

        if (salario > 2800 && salario <= 3750) {
            System.out.println("Imposto de Renda: 15% ");
        }

        if (salario > 3750 && salario <= 4750) {
            System.out.println("Imposto de Renda: 22,5% ");
        }
    }
}
