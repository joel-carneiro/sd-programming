package br.com.alura.screenwatch.models;

import java.util.ArrayList;

public class Marathon {
	private int timeTotal;
	private ArrayList<Title> titlesList = new ArrayList<>();
	
	public void includeTitle(Title title) {
		this.timeTotal += title.getTimeTotal();
		this.titlesList.add(title);
	}
	
	public int getTimeTotal() {
		return timeTotal;
	}
	
	public ArrayList<Title> getTitlesList() {
		return titlesList;
	}
}
