package com.spring.session3.beans.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotatedInjectSimple {

	@Value("John George")
	private String name;
	@Value("38")
	private int age;
	@Value("1.8")
	private float height;
	@Value("false")
	private boolean programmer;
	@Value("1241401112")
	private Long ageInSeconds;
	
	public String toString() {
		return "Name: " + name + "\n"
		+ "Age: " + age + "\n"
		+ "Age in Seconds: " + ageInSeconds + "\n"
		+ "Height: " + height + "\n"
		+ "Is Programmer?: " + programmer;
		}
	
}
