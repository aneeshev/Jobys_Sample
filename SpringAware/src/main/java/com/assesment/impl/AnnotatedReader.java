package com.assesment.impl;

import org.springframework.stereotype.Component;

import com.assesment.call.Reader;



@Component
public class AnnotatedReader implements Reader {

	@Override
	public void read() {
		System.out.println("AnnotatedReader#read");	
	}

}
