package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legacy.provider.MessageProvider;
import com.legacy.provider.impl.HelloWordsMessageProvider;
import com.legacy.renderer.MessageRenderer;
import com.legacy.renderer.impl.StandardOutMessageRenderer;

@Configuration
public class AppConfig {

	@Bean
	public MessageProvider provider() {
		return new HelloWordsMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
	
}
