package com.legacy.provider.impl;

import com.legacy.provider.MessageProvider;

public class HelloWordsMessageProvider  implements MessageProvider{

	@Override
	public String message() {
		return "Hello World";
	}

}
