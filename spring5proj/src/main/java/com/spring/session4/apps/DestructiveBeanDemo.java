package com.spring.session4.apps;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.session4.beans.DestructiveBean;

public class DestructiveBeanDemo {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:spring/session4/app-context-04.xml");
		DestructiveBean bean = context.getBean("destructiveBean", DestructiveBean.class);
		System.out.println("Calling destroy()");
		context.close();
		System.out.println("Called destroy()");
	}

}
