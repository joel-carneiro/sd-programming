package br.com.alura;

public class Aluno {
	private String nome;
	private int numeroDeMatricula;

	public Aluno(String nome, int numeroDeMatricula) {
		this.nome = nome;
		this.numeroDeMatricula = numeroDeMatricula;
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.numeroDeMatricula;
	}

	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(int numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

}
