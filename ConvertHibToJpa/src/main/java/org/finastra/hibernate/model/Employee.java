package org.finastra.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
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

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name="employee_id")
//	@OrderColumn(name="type")
	private Set<Laptop> laptops = new HashSet<Laptop>();

	public Set<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(Set<Laptop> laptops) {
		this.laptops = laptops;
	}
	
	
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
}
