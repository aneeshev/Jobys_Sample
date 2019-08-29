package com.test;

import java.io.Serializable;

public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5352462588056993785L;
	
	private int id;
	private String locaitn;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocaitn() {
		return locaitn;
	}

	public void setLocaitn(String locaitn) {
		this.locaitn = locaitn;
	}

	public Address(int id, String locaitn) {
		super();
		this.id = id;
		this.locaitn = locaitn;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", locaitn=" + locaitn + "]";
	}
	
}
