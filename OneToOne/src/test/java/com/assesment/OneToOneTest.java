package com.assesment;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.BeforeClass;
import org.junit.Test;

import com.assesment.model.User;
import com.assesment.model.UserProfile;
import com.assesment.util.PersistenceManager;

public class OneToOneTest {

	private static EntityManager entityManager;

	@BeforeClass
	public static void setUp() {
		entityManager = PersistenceManager.INSTANCE.getEntityManager();
	}

	@Test
	public void testInsertUser() {
		int success = 0;
		User user = new User("Aneesh", "Vijayan", 20);
		UserProfile userProfile = new UserProfile("Developer", "DEV");
		userProfile.setUser(user);
		user.setUserProfile(userProfile);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(user);

			transaction.commit();
			success = 1;
		} catch (Exception e) {
			transaction.rollback();
		}
		assertTrue(success == 1);
	}

	@Test
	public void testSelectUser() {
		int success = 0;
//		User user = new User("Aneesh", "Vijayan", 20);
//		UserProfile userProfile = new UserProfile("Developer", "DEV");
//		userProfile.setUser(user);
//		user.setUserProfile(userProfile);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {

			TypedQuery e = entityManager.createQuery("SELECT u FROM User u", User.class);

			List<User> users = e.getResultList();

			if (users.size() > 0)

			{
				for (User temp : users) {
					System.out.println(temp.toString());
				}
				System.out.println(users.size() + " User Records Available...!");
			}
//			Query q1 = entityManager.createQuery("SELECT * FROM User");
//			System.out.println("User : " + q1.getSingleResult());

			// entityManager.persist(user);

			transaction.commit();
			success = 1;
		} catch (Exception e) {
			transaction.rollback();
		}
		assertTrue(success == 1);
	}

	@Test
	public void testUpdateUser() {
		int success = 0;
		User user = new User("Vineesh", "Vijayan", 20);
		UserProfile userProfile = new UserProfile("Developer", "DEV");
		user.setUserId(1);
		userProfile.setProfileId(2);
		userProfile.setUser(user);
		user.setUserProfile(userProfile);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.find(User.class, 1);
			entityManager.persist(user);
			
			transaction.commit();
			success = 1;
		} catch (Exception e) {
			transaction.rollback();
		}
		assertTrue(success == 1);
	}

	@Test
	public void testRemoveUser() {
		int success = 0;
		User user = new User("Aneesh", "Vijayan", 20);
		UserProfile userProfile = new UserProfile("Developer", "DEV");
		user.setUserId(1);
		userProfile.setProfileId(2);
		userProfile.setUser(user);
		user.setUserProfile(userProfile);

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.remove(user);
			entityManager.remove(userProfile);

			transaction.commit();
			success = 1;
		} catch (Exception e) {
			transaction.rollback();
		}
		assertTrue(success == 1);
	}

}
