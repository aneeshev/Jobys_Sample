package com.spring.session4.apps;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.DestructiveBean;
import com.spring.session4.beans.DestructiveBeanWithInterface;
import com.spring.session4.beans.DestructiveBeanWithJSR250;

public class DestructiveBeanWithJSR250Demo {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context-06.xml");
		DestructiveBeanWithJSR250 bean = context.getBean("destructiveBean", DestructiveBeanWithJSR250.class);
		System.out.println("Calling destroy()");
		context.close();
		System.out.println("Called destroy()");
	}

}
