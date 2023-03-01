public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    // Um atributo static é um atributo comum a todas as classes.
    private static int total = 0;

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        
        // Sendo possível propriedades globais
        Conta.total++;
        System.out.println("Total de contas: " + total);
    }

    // Getters 

    public Cliente getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotal() {
        return Conta.total;
    }
    

    // Setters

    public void setTitular(Cliente novoTitular) {
        this.titular = novoTitular;
    }

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public void setAgencia(int novaAgencia) {
        this.agencia = novaAgencia;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    // Métodos

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        }

        else {
            return false;
        }
    }
}