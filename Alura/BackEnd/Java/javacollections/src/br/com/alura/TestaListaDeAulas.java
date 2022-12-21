package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArraysLista", 25);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		Aula a4 = new Aula("Sofisticando listas", 45);
		Aula a5 = new Aula("Aprendendo Java", 35);
		

		ArrayList<Aula> aulas = new ArrayList<>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		aulas.add(a5);

		Collections.sort(aulas);
		
		System.out.println(aulas);
		
//		Collections.sort(aulas, Comparator.comparing(Aula::getTitulo)); ou
		
		aulas.sort(Comparator.comparing(Aula::getTitulo));

		aulas.forEach(aula -> {
			System.out.println(aula);
		});
	}
}
