package br.com.nubank.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.nubank.entity.Client;
import br.com.nubank.entity.ClientManager;

public class RegisterClient {
	public static void main(String[] args) {
		Client newClient = ClientManager.getClientData();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap8");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(newClient);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
