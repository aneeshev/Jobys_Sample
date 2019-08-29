package com.spring.session3.beans.deps.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.spring.session3.beans.deps.Processor;
import com.spring.session3.beans.deps.Reader;

public class DummyProcessor implements Processor,ApplicationContextAware {

	private ApplicationContext context;
	
	@Override
	public void process() {
		Reader reader = context.getBean("reader",Reader.class);
		reader.read();
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	
	

}
