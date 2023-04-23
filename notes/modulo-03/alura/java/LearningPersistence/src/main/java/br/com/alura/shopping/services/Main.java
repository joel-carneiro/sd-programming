package br.com.alura.shopping.services;

import javax.persistence.EntityManager;

import br.com.alura.shopping.models.Product;
import br.com.alura.shopping.utils.JPAUtil;
import br.com.alura.shopping.utils.ProductDAO;

public class Main {

	public static void main(String[] args) {

		Product mouse = new Product("Mouse Gamer Pro M3 RGB 4800 DPI", "Informática", 49.90);

		EntityManager entityManager = JPAUtil.getEntityManager();
		ProductDAO productDAO = new ProductDAO(entityManager);

		entityManager.getTransaction().begin();
		productDAO.saveProduct(mouse);
		productDAO.removeProduct(mouse);
		entityManager.getTransaction().commit();
	}

}
