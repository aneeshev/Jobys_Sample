package com.spring.session4.apps;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.config.AppConfig;
import com.spring.session4.beans.Singer;

public class BeanInitDemo {

	@Configuration
	static class SingerConfig{
		
		@Lazy
		@Bean(initMethod = "init")
		public Singer singerOne() {
			Singer singerOne = new Singer();
			singerOne.setName("John Mayer");
			singerOne.setAge(39);
			return singerOne;
		}
		
		@Lazy
		@Bean(initMethod = "init")
		public Singer singerTwo() {
			Singer singerTwo = new Singer();
			singerTwo.setAge(72);
			return singerTwo;
		}
		
		@Lazy
		@Bean(initMethod = "init")
		public Singer singerThree() {
			Singer singerThree = new Singer();
			singerThree.setName("John Butler");
			return singerThree;
		}
	}
	
	public static void main(String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(SingerConfig.class);) {
		//try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context.xml");) {
			Singer singer = context.getBean("singerOne", Singer.class);
			System.out.println("Singer 1");
			System.out.println(singer);
			Singer singer2 = context.getBean("singerTwo", Singer.class);
			System.out.println("Singer 2");
			System.out.println(singer2);
			Singer singer3 = context.getBean("singerThree", Singer.class);
			System.out.println("Singer 3");
			System.out.println(singer3);
		}catch (BeanCreationException e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}
	
	
}
