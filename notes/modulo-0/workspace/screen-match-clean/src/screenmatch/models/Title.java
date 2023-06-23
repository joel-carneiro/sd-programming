package screenmatch.models;

import com.google.gson.annotations.SerializedName;

public class Title {
	@SerializedName("Title")
	private String titleName;

	@SerializedName("Year")
	private String year;

	@SerializedName("Genre")
	private String genre;

	@SerializedName("imdbRating")
	private double imdbRating;

	public Title(String titleName, String year, String genre, double imdbRating) {
		this.titleName = titleName;
		this.year = year;
		this.genre = genre;
		this.imdbRating = imdbRating;
	}

	public void displayTechnicalSheet() {
		System.out.println();
		System.out.println("TITLE:\t" + this.titleName);
		System.out.println("YEAR:\t" + this.year);
		System.out.println("GENRE:\t" + this.genre);
		System.out.println("RATING:\t" + this.imdbRating);
		System.out.println();
	}

	public String toCsv() {
		return String
				.format("%s;%s;%s;%s", this.titleName, this.year, this.genre, this.imdbRating);
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", this.titleName, this.year);
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

}
