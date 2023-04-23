package br.com.alura.icompany.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.icompany.models.Company;
import br.com.alura.icompany.models.Database;

@WebServlet("/register_company")
public class RegisterCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String companyName = req.getParameter("name");
		String companyCPNJ = req.getParameter("cnpj");
		
		Company company = new Company(companyName, companyCPNJ);
		
		Database.add(company);
		Database.show();
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("new_company.jsp");
		
		req.setAttribute("company", companyName);
		requestDispatcher.forward(req, resp);
		
	}

}
