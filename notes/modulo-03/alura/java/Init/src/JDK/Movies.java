package JDK;

import java.util.Scanner;

public class Movies {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-vindo ao Screen Match");
		
		Movie m1 = new Movie("Top Gun: Maverick", "2h45min", 2020);
		Movie m2 = new Movie("The Batman", "3h05min", 2022);
		Movie m3 = new Movie("Homem-Aranha: Através do Aranhaverso (Parte Um)", "2h01min", 2023);
		Movie m4 = new Movie("De Volta Para o Futuro", "01h56min", 1989);
		Movie m5 = new Movie("Taxi Driver", "01h54min", 1976);
		
		System.out.print("Título do novo filme: ");
		String title = scanner.nextLine();
		System.out.print("Duração do filme: ");
		String time = scanner.nextLine();
		System.out.print("Ano de lançamnto: ");
		int year = scanner.nextInt();
		
		Movie m6 = new Movie(title, time, year);
		
		Movie[] movies = {m1, m2, m3, m4, m5, m6};
	
		System.out.println("===== ÚLTIMOS FILMES =====");
		for (Movie movie : movies) {
			if (movie.getMovieYear() >= 2020) {
				System.out.println(movie.getMovieTitle());
			}	
		}
		
		scanner.close();
	}
}
