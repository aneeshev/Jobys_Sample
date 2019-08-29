package com.spring.session4.apps;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.Singer;

public class InitMethodCallbackDemo {
	
	public static void main(String[] args) {
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context.xml");) {
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
