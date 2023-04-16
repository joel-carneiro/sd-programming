package br.com.alura.screenwatch.main;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.Scanner;

import com.google.gson.Gson;

import br.com.alura.screenwatch.models.Title;
import br.com.alura.screenwatch.models.TitleOMDB;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Escolha um filme para buscar: ");
    	String title = scanner.nextLine();
    	
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(String.format("https://www.omdbapi.com/?t=%s&apikey=208c003c", title)))
		.build();
		   
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String json = response.body();
		
		Gson gson = new Gson();
		
		TitleOMDB titleOMDB = gson.fromJson(json, TitleOMDB.class);
		
		System.out.println(titleOMDB);
		
    }
}
