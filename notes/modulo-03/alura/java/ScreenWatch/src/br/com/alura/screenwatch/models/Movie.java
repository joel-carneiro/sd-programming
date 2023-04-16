package br.com.alura.screenwatch.models;

public class Movie extends Title {
	private String director;
	
	public Movie(String name, int releaseYear, double score, boolean inTheCatalog, String director, int timeTotal) {
		super(name, releaseYear, score, inTheCatalog);
		this.director = director;
		this.timeTotal = timeTotal;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
