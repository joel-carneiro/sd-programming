package screenwatch.runner;

import java.io.IOException;
import java.util.Scanner;

import screenwatch.models.Title;
import screenwatch.models.TitleManager;

public class MainAPI {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner input = new Scanner(System.in);
		String userInput = "";
		
		while (true) {
			System.out.print("Enter the movie you want: ");
			userInput = input.nextLine();
			
			if (userInput.equals("quit!")) {
				break;
			}

			String json = TitleManager.getRequest(userInput);
			Title title = TitleManager.convertJsonToTitle(json);

			title.displayTechnicalSheet();
		}
		
		System.out.println("Program completed successfully!");
		
		input.close();
	}
}
