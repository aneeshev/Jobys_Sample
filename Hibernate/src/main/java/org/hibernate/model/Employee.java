package org.hibernate.model;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "employee")
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class Employee {
	@Id
	@Column(name = "employee_id")
	private Integer employeeID;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_gender")
	private String employeeGender;

	@Column(name = "employee_age")
	private Integer employeeAge;

//	@OneToOne
//	@PrimaryKeyJoinColumn
//	private Transaction transaction;

	
	public Integer getEmployeeID() {
		return employeeID;
	}
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public Employee() {
	}

	public Employee(Integer employeeID, String employeeName, String employeeGender, Integer employeeAge) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeAge = employeeAge;
	}

//	public Transaction getTransaction() {
//		return transaction;
//	}
//
//	public void setTransaction(Transaction transaction) {
//		this.transaction = transaction;
//	}
	
	
}
