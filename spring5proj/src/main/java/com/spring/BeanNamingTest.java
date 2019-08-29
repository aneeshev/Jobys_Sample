package com.spring;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.annotated.beans.Singer;

public class BeanNamingTest {

	public static void main(String[] args) {
	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-bean-names-02.xml");
		ctx.refresh();
		
		Map<String,String> beans = ctx.getBeansOfType(String.class);
		beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
		
		Map<String,Singer> beans2 = ctx.getBeansOfType(Singer.class);
		beans2.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
		
		ctx.close();
		
	}

}
