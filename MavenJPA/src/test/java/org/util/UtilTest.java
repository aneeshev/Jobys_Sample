package org.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.hibernate.model.Employee;
import org.hibernate.util.PersistenceManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UtilTest {

	private static EntityManager entityManager;
	
	@BeforeClass
	public static void setUp() {
		entityManager = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	@Test
	public void testAddEmployee() {
		Employee emp_1 = new Employee(1, "Sergio delValle", "Male", 40);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(emp_1);
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
		}
	}
	
	@Test
	public void testFindEmployeeByID() {
		Employee employee = entityManager.find(Employee.class, 1);
		System.out.println(employee);
		Assert.assertNotNull(employee);
	}
	
	@Test
	public void testFindAllEmployees() {
		List<Employee> employees = entityManager.createQuery("select e from Employee e",Employee.class).getResultList();
		Assert.assertNotNull(employees);
		employees.stream().forEach(System.out::println);
	}
	
	@AfterClass
	public static void cleanUp() {
		entityManager.close();
		PersistenceManager.INSTANCE.close();
	}
	
}
