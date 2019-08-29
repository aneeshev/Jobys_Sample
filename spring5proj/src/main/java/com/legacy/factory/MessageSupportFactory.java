package com.legacy.factory;

import java.io.IOException;
import java.util.Properties;

import com.legacy.provider.MessageProvider;
import com.legacy.renderer.MessageRenderer;

public class MessageSupportFactory {

	private static MessageSupportFactory INSTANCE;
	
	private MessageProvider provider;
	private MessageRenderer renderer;
	private Properties properties = new Properties();
	
	private MessageSupportFactory() {
		try {
			properties.load(getClass().getResourceAsStream("/factory.properties"));
			provider = (MessageProvider) Class.forName(properties.getProperty("provider")).newInstance();
			renderer = (MessageRenderer) Class.forName(properties.getProperty("renderer")).newInstance();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (InstantiationException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static MessageSupportFactory getInstance() {
		if(INSTANCE == null)
			INSTANCE = new MessageSupportFactory();
		return INSTANCE;
	}


	public MessageProvider getProvider() {
		return provider;
	}

	public MessageRenderer getRenderer() {
		return renderer;
	}
	
}
