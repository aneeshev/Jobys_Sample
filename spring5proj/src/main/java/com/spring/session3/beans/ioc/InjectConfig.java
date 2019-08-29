package com.spring.session3.beans.ioc;

import org.springframework.stereotype.Component;

@Component
public class InjectConfig {

	private String name = "Thomas George";
	private int age = 37;
	private float height = 1.82f;
	private boolean programmer = true;
	private Long ageInSeconds = 1_241_401_112L;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}
	
}
