package br.com.alura.icompany.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.icompany.models.Company;
import br.com.alura.icompany.models.Database;

@WebServlet("/companys_names")
public class CompanysNames extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		for (Company c : Database.getCompanys()) {
			out.println(c);
		}
		
	}

}
