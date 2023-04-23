package br.com.alura.icompany.models;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List<Company> companys = new ArrayList<>();
	
	public static void add(Company c) {
		companys.add(c);
	}
	
	public static void show() {
		System.out.println(companys);
	}
	
	public static void setCompanys(List<Company> companys) {
		Database.companys = companys;
	}
	
	public static List<Company> getCompanys() {
		return companys;
	}
}
