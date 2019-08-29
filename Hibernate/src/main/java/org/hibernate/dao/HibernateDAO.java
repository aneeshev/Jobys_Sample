package org.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.model.Employee;
import org.hibernate.util.HibernateUtil;

public class HibernateDAO {
	public Integer addEmployee(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Integer id = null;
		try {
			tx = session.beginTransaction();
			id = (Integer) session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return id;
	}

	public Employee getEmployeeByID(Integer employeeID) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Employee employee = null;
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			employee = (Employee) session.get(Employee.class, 2);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		Employee employee2 = null;
		Transaction tx2 = null;
		try {
			tx2 = session2.beginTransaction();
			employee2 = (Employee) session2.get(Employee.class, 2);
			tx2.commit();
		} catch (HibernateException e) {
			if (tx2 != null) {
				tx2.rollback();
			}
		} finally {
			session2.close();
		}
		return employee;
	}

	public List<Employee> getEmployeeList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		List<Employee> employees = null;
		try {
			tx = session.beginTransaction();
			employees = (List<Employee>) session.createQuery("FROM Employee").list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
		return employees;
	}

	public void updateEmployee(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee emp = (Employee) session.get(Employee.class, employee.getEmployeeID());
			emp.setEmployeeName(employee.getEmployeeName());
			emp.setEmployeeGender(employee.getEmployeeGender());
			emp.setEmployeeAge(employee.getEmployeeAge());
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

	public void deleteEmployeeByID(Integer employeeID) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, employeeID);
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}

	public void deleteAllEmployees() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.createQuery("DELETE FROM Employee").executeUpdate();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	
}
