package com.spring.session4.apps;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.SingerWithInterface;

public class InitializingBeanCallbackDemo {
	
	public static void main(String[] args) {
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context-02.xml");) {
			SingerWithInterface singer = context.getBean("singerOne", SingerWithInterface.class);
			System.out.println("Singer 1");
			System.out.println(singer);
			SingerWithInterface singer2 = context.getBean("singerTwo", SingerWithInterface.class);
			System.out.println("Singer 2");
			System.out.println(singer2);
			SingerWithInterface singer3 = context.getBean("singerThree", SingerWithInterface.class);
			System.out.println("Singer 3");
			System.out.println(singer3);
		}catch (BeanCreationException e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}

}
