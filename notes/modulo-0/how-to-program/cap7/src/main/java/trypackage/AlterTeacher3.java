package trypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifce.entity.Teacher;

public class AlterTeacher3 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cap7");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Teacher teacher = entityManager.find(Teacher.class, 7L);
		teacher.setEmail("williamdabruzo@ibilce.com");
		
		entityManager.detach(teacher);
		
		entityManager.merge(teacher);
		
		entityManager.getTransaction().commit();
		
		System.out.println(teacher);
		
		entityManager.close();
		entityManagerFactory.close();
	}
}
