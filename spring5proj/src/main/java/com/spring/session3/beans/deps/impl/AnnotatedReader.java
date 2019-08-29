package com.spring.session3.beans.deps.impl;

import org.springframework.stereotype.Component;

import com.spring.session3.beans.deps.Reader;

@Component
public class AnnotatedReader implements Reader {

	@Override
	public void read() {
		System.out.println("AnnotatedReader#read");	
	}

}
