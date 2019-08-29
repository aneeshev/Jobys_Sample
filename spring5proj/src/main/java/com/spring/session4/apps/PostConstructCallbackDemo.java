package com.spring.session4.apps;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.SingerWithJSR250;

public class PostConstructCallbackDemo {

	public static void main(String[] args) {
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context-03.xml");) {
			SingerWithJSR250 singer = context.getBean("singerOne", SingerWithJSR250.class);
			System.out.println("Singer 1");
			System.out.println(singer);
			SingerWithJSR250 singer2 = context.getBean("singerTwo", SingerWithJSR250.class);
			System.out.println("Singer 2");
			System.out.println(singer2);
			SingerWithJSR250 singer3 = context.getBean("singerThree", SingerWithJSR250.class);
			System.out.println("Singer 3");
			System.out.println(singer3);
		}catch (BeanCreationException e) {
			System.out.println("Exception : "+e.getMessage());
		}
	}
}
