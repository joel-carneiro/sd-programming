package trypackage;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.edu.ifce.entity.Teacher;

public class SearchTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("cap7");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		final String JPQL = "SELECT u FROM Teacher u";
		TypedQuery<Teacher> typedQuery = entityManager.createQuery(JPQL, Teacher.class);
		typedQuery.setMaxResults(5);
		
		List<Teacher> teachers = typedQuery.getResultList();
		
		for (Teacher teacher : teachers) {
			System.out.printf("NOME: %s; EMAIL: %s \n", teacher.getFullName(), teacher.getEmail());
		}
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
