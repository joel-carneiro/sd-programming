package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public int getAlunos() {
		return alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
}

public class ExemploCursos {

	public static void main(String[] args) {
			List<Curso> cursos = new ArrayList<Curso>();
			cursos.add(new Curso("Python", 150));
			cursos.add(new Curso("Java", 350));
			cursos.add(new Curso("C++", 50));
			cursos.add(new Curso("PHP", 250));
			cursos.add(new Curso("JavaScript", 10));
			
			cursos.sort(Comparator.comparing(Curso::getAlunos));
//			
//			cursos.stream().filter(c -> c.getAlunos() > 100).
//			forEach(c -> System.out.println(c.getNome()));;
			
//			cursos.stream()
//			.filter(c -> c.getAlunos() > 100)
//			.map(Curso::getAlunos)
//			.forEach(System.out::println);;
			
			List<Curso> cursoMaioresQue100 = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toList());
			
			cursos.forEach(c -> System.out.println(c.getNome()));
			System.out.println();
			cursoMaioresQue100.forEach(c -> System.out.println(c.getNome()));
			
//			cursos.forEach(c -> System.out.println(c.getNome()));

	}

}
