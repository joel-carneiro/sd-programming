public class Gerente extends FuncionarioAutenticavel {

    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);

        this.senha = senha;
    }
    
    public double getBonificacao() {
        return super.getSalario() * 0.1 + super.getSalario();
    }

}
