package screenmatch.models;

public class Series extends Title {
	
	private int totalSeasons;
	private String minutesPerEpisode;

	public Series(String titleName, String year, String genre, double imdbRating) {
		super(titleName, year, genre, imdbRating);
	}
	
	public int getTotalSeasons() {
		return totalSeasons;
	}
	
	public void setTotalSeasons(int totalSeasons) {
		this.totalSeasons = totalSeasons;
	}
	
	public String getMinutesPerEpisode() {
		return minutesPerEpisode;
	}
	
	public void setMinutesPerEpisode(String minutesPerEpisode) {
		this.minutesPerEpisode = minutesPerEpisode;
	}
	
}
