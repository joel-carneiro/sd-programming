package screenmatch.models;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ScreenMatchManager {
	private HttpClient client;

	public ScreenMatchManager() {
		this.client = HttpClient.newHttpClient();
	}

	public HttpRequest getRequest(String connectionString) {
		return HttpRequest.newBuilder().uri(URI.create(connectionString)).build();
	}

	public HttpResponse<String> getResponse(String connectionString) {
		HttpRequest request = this.getRequest(connectionString);

		try {
			return client.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (Exception e) {
			System.out.println("\u001B[31m" + "Unfortunately, an unexpected error has occurred. =(" + "\u001B[0m");
			return null;
		}
	}
	
}
