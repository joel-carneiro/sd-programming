package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Lopes");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Fernandes");

		alunos.forEach(aluno -> System.out.println(aluno));
		
	}
}
