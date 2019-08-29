package com.spring.session3.beans.deps.impl;

import com.spring.session3.beans.deps.Reader;

public class DummyReader implements Reader {

	@Override
	public void read() {
		System.out.println("DummyReader#read");
	}

}
