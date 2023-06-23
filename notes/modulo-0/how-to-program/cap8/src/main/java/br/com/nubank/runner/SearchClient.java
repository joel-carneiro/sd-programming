package br.com.nubank.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nubank.entity.Client;

public class SearchClient {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap8");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Client client = entityManager.find(Client.class, "6633");
		
		System.out.println(client.getFullName());
		
		entityManagerFactory.close();
		entityManager.close();
	}
}
