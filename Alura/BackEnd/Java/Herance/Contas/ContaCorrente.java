// Herdando de uma classe

public class ContaCorrente extends Conta {
    public ContaCorrente(double saldo, int agencia, int numero, Cliente titular) {
        // Herdando definição de atributos da classe mãe
        super(saldo, agencia, numero, titular);
    }

    public boolean saca(double valor) {
        double ValorASacar = valor + 0.2;
        return super.saca(ValorASacar);
    }

} // Fim da Classe
