package JDK;

public class Movie {
	
	private String movieTitle = "Top Gun: Maverick";
	private String movieTime = "2h45min";
	private int movieYear = 2020;
	
	public Movie(String movieTitle, String movieTime, int movieYear) {
		this.movieTitle = movieTitle;
		this.movieTime = movieTime;
		this.movieYear = movieYear;
	}
	
	@Override
	public String toString() {
		return movieTitle + " | " + movieYear + " | " + movieTime;
	}
	
	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	
	
}
