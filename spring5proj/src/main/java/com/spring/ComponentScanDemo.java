package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.annotated.beans.Player;

public class ComponentScanDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-types.xml");
		ctx.refresh();
		
		Player player = ctx.getBean("player", Player.class);
		System.out.println(player);
		
		ctx.close();
	}

}
