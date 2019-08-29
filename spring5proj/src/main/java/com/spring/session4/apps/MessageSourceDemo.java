package com.spring.session4.apps;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {

	public static void main(String[] args) {
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext(
				"classpath:spring/session4/app-context-i18n.xml");) {

			Locale english = Locale.ENGLISH;
			Locale german = new Locale("de", "DE");

			System.out.println(context.getMessage("msg", null, english));
			System.out.println(context.getMessage("msg", null, german));
			System.out.println(context.getMessage("nameMsg", new Object[] { "John", "Mayer" }, english));
			System.out.println(context.getMessage("nameMsg", new Object[] { "John", "Mayer" }, german));

		}
	}

}
