package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Lambdas {

	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Alura Online");
		words.add("Caelum");
		words.add("Editora casa do código.");

//		words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		words.sort(comparador);
		
		words.sort(Comparator.comparing(s -> s.length()));
		words.sort(Comparator.comparing(String::length));
		
		words.forEach(s -> System.out.println(s));
	}
	
}