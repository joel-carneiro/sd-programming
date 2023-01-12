

public abstract class FuncionarioAutenticavel extends Funcionario {
    private int senha;

    public FuncionarioAutenticavel(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public boolean autentica(int senha) {
        return senha == this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }



}
