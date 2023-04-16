package br.com.alura.screenwatch.models;

import java.io.Serializable;

public class Title implements Comparable<Title>, Serializable{

	private String name;
	private int releaseYear;
	private double score;
	private boolean inTheCatalog;
	protected int timeTotal;
	
	public Title(String name, int releaseYear, double score, boolean inTheCatalog) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.score = score;
		this.inTheCatalog = inTheCatalog;
	}
	

	@Override
	public int compareTo(Title t) {
		return this.getName().compareTo(t.getName());
	}
	
	@Override
	public String toString() {
		return String.format("%s (%d)", this.name, this.releaseYear);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public boolean isInTheCatalog() {
		return inTheCatalog;
	}
	
	public void setInTheCatalog(boolean inTheCatalog) {
		this.inTheCatalog = inTheCatalog;
	}
	
	public int getTimeTotal() {
		return timeTotal;
	}
	
	public void setTimeTotal(int timeTotal) {
		this.timeTotal = timeTotal;
	}
	
}

