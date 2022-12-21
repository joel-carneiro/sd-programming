package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java e Java Collections", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando a classe Aula", 20));
		javaColecoes.adiciona(new Aula("Comparando Aulas", 22));

		Aluno a1 = new Aluno("Leandro Twin", 3345);
		Aluno a2 = new Aluno("Paulo Muzy", 1005);
		Aluno a3 = new Aluno("Renato Cariani", 2001);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

//		System.out.println("Alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

		Aluno twin = new Aluno("Leandro Twin", 3345);

		System.out.println(a1.equals(twin));
	}
}
