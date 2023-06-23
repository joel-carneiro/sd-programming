package screenmatch.models;

import com.google.gson.Gson;

public class OmdbAPI {
	private final String url = "https://www.omdbapi.com";
	private String apiKey;
	
	public OmdbAPI(String apiKey) {
		this.apiKey = apiKey;
	}
	
	public String getConnectionString(String titleName) {
		return String.format("%s/?t=%s&apikey=%s", this.url, titleName, this.apiKey);
	}
	
	public Title convertJson(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, Title.class);
	}
}
