package br.com.alura.screenwatch.models;

public class Series extends Title {

	private int numberOfSeasons;
	private int minutesPerEpisode;
	private int numberOfEpisodesPerSeason;

	public Series(String name, int releaseYear, double score, boolean inTheCatalog, int numberOfSeasons,
			int minutesPerEpisode, int numberOfEpisodesPerSeason) {
		
		super(name, releaseYear, score, inTheCatalog);
		this.numberOfSeasons = numberOfSeasons;
		this.minutesPerEpisode = minutesPerEpisode;
		this.numberOfEpisodesPerSeason = numberOfEpisodesPerSeason;
		
	}

	public int getNumberOfSeasons() {
		return numberOfSeasons;
	}

	public void setNumberOfSeasons(int numberOfSeasons) {
		this.numberOfSeasons = numberOfSeasons;
	}

	public int getMinutesPerEpisode() {
		return minutesPerEpisode;
	}

	public void setMinutesPerEpisode(int minutesPerEpisode) {
		this.minutesPerEpisode = minutesPerEpisode;
	}

	public int getNumberOfEpisodesPerSeason() {
		return numberOfEpisodesPerSeason;
	}

	public void setNumberOfEpisodesPerSeason(int numberOfEpisodesPerSeason) {
		this.numberOfEpisodesPerSeason = numberOfEpisodesPerSeason;
	}
	
	@Override
	public int getTimeTotal() {
		return numberOfSeasons * numberOfEpisodesPerSeason * minutesPerEpisode;
	}
	
}
