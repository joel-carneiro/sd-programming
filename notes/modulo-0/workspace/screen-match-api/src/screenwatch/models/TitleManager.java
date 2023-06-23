package screenwatch.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class TitleManager {

	public static String getRequest(String titleName) throws IOException, InterruptedException {

		final String apiURL = "https://www.omdbapi.com/?t=";
		titleName = titleName.replace(" ", "+");
		final String apiKey = "&apikey=208c003c";

		final String URL = apiURL + titleName + apiKey;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return response.body();
	}

	public static Title convertJsonToTitle(String json) {
		Gson gson = new Gson();
		Title title = gson.fromJson(json, Title.class);
		return title;
	}
}
