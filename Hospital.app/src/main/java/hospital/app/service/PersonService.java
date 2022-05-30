package hospital.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hosptal.app.dto.Person;


public class PersonService {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("uday");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = null;
	
	public void createPerson(Person person) {
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(person);
		
		entityTransaction.commit();
		
	}
	
	public List<Person> getAllPerson() {
		Query query = entityManager.createQuery("SELECT p FROM Person p");
		return query.getResultList();
	}

}
