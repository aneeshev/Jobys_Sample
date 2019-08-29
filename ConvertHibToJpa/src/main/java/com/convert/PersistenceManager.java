package com.convert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public enum PersistenceManager {
	INSTANCE;

	private EntityManagerFactory entityManagerFactory;

	private PersistenceManager() {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPATester");
	}

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	public void close() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
	}
}
