package com.convert;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.finastra.hibernate.model.Employee;
import org.finastra.hibernate.model.Laptop;

/**
 * Hello world!
 *
 */
public class App {
	private static EntityManager entityManager;
	
	public static void main(String[] args) {
		System.out.println("Hello Started!");

		entityManager = PersistenceManager.INSTANCE.getEntityManager();

		Laptop laptop = new Laptop();
		laptop.setLaptopname("Dell");
		
		Laptop laptop_hp = new Laptop();
		laptop_hp.setLaptopname("HP");
		
		Employee emp_1 = new Employee(1, "Sergio delValle", "Male", 40);
		emp_1.getLaptops().add(laptop);
		emp_1.getLaptops().add(laptop_hp);
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(emp_1);
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
		}
		
		System.out.println("Hello Ended!");
	}
}
