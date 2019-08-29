package com.spring.session4.apps;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.DestructiveBean;
import com.spring.session4.beans.DestructiveBeanWithInterface;

public class DestructiveBeanWithInterfaceDemo {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context-05.xml");
		DestructiveBeanWithInterface bean = context.getBean("destructiveBean", DestructiveBeanWithInterface.class);
		System.out.println("Calling destroy()");
		context.close();
		System.out.println("Called destroy()");
	}

}
