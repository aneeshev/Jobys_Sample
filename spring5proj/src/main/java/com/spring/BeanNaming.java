package com.spring;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNaming {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-bean-names.xml");
		ctx.refresh();
		
		Map<String,String> beans = ctx.getBeansOfType(String.class);
		beans.entrySet().stream().forEach(b ->
		{
		System.out.println("id: " + b.getKey() +
		"\n aliases: " + Arrays.toString(ctx.getAliases(b.getKey())) +"\n");
		});
		
		ctx.close();
	}
	
}
