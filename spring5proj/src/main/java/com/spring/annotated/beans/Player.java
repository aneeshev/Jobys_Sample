package com.spring.annotated.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("nonSingleton")
public class Player {

	private String name = "unknown";
	
	public Player(@Value("John Mayer") String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
