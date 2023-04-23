package br.com.alura.shopping.utils;

import javax.persistence.EntityManager;

import br.com.alura.shopping.models.Product;

public class ProductDAO {

	private EntityManager entityManager;

	public ProductDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void saveProduct(Product p) {
		this.entityManager.persist(p);
	}
	
	public void removeProduct(Product p) {
		this.entityManager.remove(p);
	}

}
