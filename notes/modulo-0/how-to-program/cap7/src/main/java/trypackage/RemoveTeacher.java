package trypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.entity.Teacher;

public class RemoveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap7");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Teacher teacher = entityManager.find(Teacher.class, 9L);
		
		entityManager.getTransaction().begin();
		
		if(teacher != null) {
			entityManager.remove(teacher);
		}
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
	}
}