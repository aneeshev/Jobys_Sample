package com.test;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Employee implements Serializable{
	
	//private static final long serialVersionUID = 2752055952394710128L;
	private static final long serialVersionUID = 5161596503497437431L;
	
	private transient long id;
	private static String name;
	
	private static final String CODE = "S";
	
	private Address address;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Employee(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee(long id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
//	private Object readResolve() throws ObjectStreamException {
//		return 
//	}
	
}
