package screenwatch.models;

public class Movie extends Title {
	private String director;
	private int durationInMinutes;

	public Movie(String title, String generalGender, String releaseYear, String director, int durationInMinutes) {
		super(title, generalGender, releaseYear);
		this.director = director;
		this.durationInMinutes = durationInMinutes;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}
	
}
