package br.com.alura.shopping.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("shopping");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}

}
