package com.spring.session3.beans.ioc;

public class Dependency {
	
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "ID: " + id + "\n"
		+ "Name: " + name ;
	}
	

}
