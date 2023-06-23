package screenwatch.models;

import com.google.gson.annotations.SerializedName;

public class Title implements Sortable, Comparable<Title> {

	// Attributes
	
	@SerializedName("Title")
	private String title;
	
	@SerializedName("Genre")
	private String generalGender;
	
	@SerializedName("Year")
	private String releaseYear;
	
	@SerializedName("Plot")
	private String plot;
	
	private int totalRatings;
	private double sumOfRatings;

	public Title(String title, String generalGender, String releaseYear) {
		this.title = title;
		this.generalGender = generalGender;
		this.releaseYear = releaseYear;
	}

	// Methods

	public double getAverage() {
		return this.sumOfRatings / this.totalRatings;
	}

	public void evalute(double note) {

		if (note > 10 || note < 0) {
			System.out.println("Não é possível avaliar com uma nota maior que 10 ou menor que 0.");
		} else {
			this.sumOfRatings += note;
			this.totalRatings += 1;
		}
	}

	public void displayTechnicalSheet() {
		System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
		System.out.println("Título:\t\t\t" + this.title);
		System.out.println("Gênero:\t\t\t" + this.generalGender);
		System.out.println("Synopsis:\t\t" + this.plot);
		System.out.println("Ano de Lançamento:\t" + this.releaseYear);
		System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
	}

	@Override
	public String toString() {
		return String.format("%s (%d)", this.title, this.releaseYear);
	}

	public boolean equals(Title otherTitle) {
		return otherTitle.getTitle().equals(this.getTitle());
	}

	public int compareTo(Title otherTitle) {
		return this.getTitle().compareTo(otherTitle.getTitle());
	}

	// Getters and Setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGeneralGender() {
		return generalGender;
	}

	public void setGeneralGender(String generalGender) {
		this.generalGender = generalGender;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public double getSumOfRatings() {
		return sumOfRatings;
	}

	public int getTotalRatings() {
		return totalRatings;
	}
	
	public String getPlot() {
		return plot;
	}
	
	public void setPlot(String plot) {
		this.plot = plot;
	}

}
