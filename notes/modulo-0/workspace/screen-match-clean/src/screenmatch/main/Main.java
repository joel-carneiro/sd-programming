package screenmatch.main;

import java.net.http.HttpResponse;
import java.util.Scanner;

import screenmatch.models.OmdbAPI;
import screenmatch.models.ScreenMatchManager;
import screenmatch.models.Title;

public class Main {
	public static void main(String[] args) {
		
		String titleName = "";
		
		Scanner input = new Scanner(System.in);
		ScreenMatchManager manager = new ScreenMatchManager();
		OmdbAPI omdb = new OmdbAPI("208c003c");
		
		while (!titleName.equals("q!")) {
			
			System.out.print("enter title name: ");
			titleName = input.nextLine().replace(" ", "+");
			
			HttpResponse<String> response = manager.getResponse(omdb.getConnectionString(titleName));
			Title title = omdb.convertJson(response.body());
			
			title.displayTechnicalSheet();
		}
		
		System.out.println("Programa finalizado com sucesso!");
		
		input.close();
	}
}
