package org.hibernate.test;

import java.util.List;

import org.hibernate.dao.HibernateDAO;
import org.hibernate.model.Employee;
import org.hibernate.model.Transaction;

public class EmployeeCRUD {
	public static void main(String[] args) {

		HibernateDAO dao = new HibernateDAO();
//		// Add a new employees
		Employee emp_1 = new Employee(1, "Sergio delValle", "Male", 40);
//		Employee emp_2 = new Employee(2, "Derek", "Male", 35);
//		Employee emp_3 = new Employee(3, "Diane Meyer", "Female", 45);
//		Employee emp_4 = new Employee(4, "Robyn Storey", "Female", 37);
//		
		//Transaction transaction = new Transaction("txn1",emp_1);
		
		dao.addEmployee(emp_1);
		
//		dao.addEmployee(emp_2);
//		dao.addEmployee(emp_3);
//		dao.addEmployee(emp_4);
		
		// Get all employees
//		List<Employee> employees = dao.getEmployeeList();
//		employees.forEach(e -> {
//			System.out.println(e.getEmployeeID()+","+e.getEmployeeName()+","+e.getEmployeeGender()+","+e.getEmployeeAge());
//		});
		
		// Find employee by ID
		Employee employee = dao.getEmployeeByID(1);			
		//System.out.println(employee.getEmployeeID()+","+employee.getEmployeeName()+","+employee.getEmployeeGender()+","+employee.getEmployeeAge());
		
		// Update employee details
//		emp_2.setEmployeeName("Derek Henry");
//		dao.updateEmployee(emp_2);
		
		// Delete employee by ID
		//dao.deleteEmployeeByID(emp_3.getEmployeeID());
		
		// Delete all employees
		//dao.deleteAllEmployees();
		
	}
}
