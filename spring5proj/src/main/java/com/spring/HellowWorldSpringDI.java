package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.legacy.renderer.MessageRenderer;
import com.spring.config.AppConfig;

public class HellowWorldSpringDI {

	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);) {
			MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
			renderer.render();
		}
	}	
}
