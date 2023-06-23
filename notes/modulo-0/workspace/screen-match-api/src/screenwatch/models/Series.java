package screenwatch.models;

public class Series extends Title {
	private int minutesPerEpisode;
	private int numberOfSeasons;

	public Series(String title, String generalGender, String releaseYear, int minutesPerEpisode, int numberOfSeasons) {
		super(title, generalGender, releaseYear);
		this.minutesPerEpisode = minutesPerEpisode;
		this.numberOfSeasons = numberOfSeasons;
	}

	public int getMinutesPerEpisode() {
		return minutesPerEpisode;
	}

	public void setMinutesPerEpisode(int minutesPerEpisode) {
		this.minutesPerEpisode = minutesPerEpisode;
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(int numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}

}
