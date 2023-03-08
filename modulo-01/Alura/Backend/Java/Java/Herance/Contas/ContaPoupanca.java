public class ContaPoupanca extends Conta {
    
    double rentabilidade;

    public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular, double rentabilidade) {
        super(saldo, agencia, numero, titular);
        this.rentabilidade = rentabilidade;
    }

    public void passaMes() {
         double novoSaldo = getSaldo() * (1 + rentabilidade);
         setSaldo(novoSaldo);
    }
}
