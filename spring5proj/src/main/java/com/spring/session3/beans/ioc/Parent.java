package com.spring.session3.beans.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {
	
	private String name;
	
	@Autowired
	private Child child;
	
	public Parent() {
	
	}

	public Parent(Child child) {
		this.child = child;
	}
	
	public Parent(Child child,String name) {
		this.child = child;
		this.name = name;
	}
	
	
	public Child getChild() {
		return this.child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public String getName() {
		return name;
	}
	
}
