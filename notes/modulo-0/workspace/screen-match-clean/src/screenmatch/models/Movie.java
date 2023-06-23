package screenmatch.models;

public class Movie extends Title {
	
	private String director;
	private String runtime;

	public Movie(String titleName, String year, String genre, double imdbRating) {
		super(titleName, year, genre, imdbRating);
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getRuntime() {
		return runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	

}
