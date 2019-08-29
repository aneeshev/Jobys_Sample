package com.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.annotated.beans.Player;
import com.spring.annotated.beans.Singer;

public class NonSingletonDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 	new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-bean-modes.xml");
		ctx.refresh();
		
		GenericXmlApplicationContext ctx2 = 	new GenericXmlApplicationContext();
		ctx2.load("classpath:spring/app-context-bean-modes.xml");
		ctx2.refresh();

		
		Player player1 = ctx.getBean("nonSingleton", Player.class);
		Player player2 = ctx.getBean("nonSingleton", Player.class);
		
		Player player3 = ctx2.getBean("nonSingleton", Player.class);
		
		
		System.out.println("Identity Equal?: " + (player1 == player2));
		System.out.println("Identity Equal from different context?: " + (player1 == player3));
		
		System.out.println("Value Equal:? " + player1.equals(player2));
		System.out.println(player1);
		System.out.println(player2);
		
		ctx.close();
		ctx2.close();
		
	}

}
