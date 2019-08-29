package com.legacy;

import com.legacy.provider.MessageProvider;
import com.legacy.provider.impl.HelloWordsMessageProvider;
import com.legacy.renderer.MessageRenderer;
import com.legacy.renderer.impl.StandardOutMessageRenderer;

public class HelloWorldDecoupled {

	public static void main(String[] args) {
		MessageProvider provider = new HelloWordsMessageProvider();
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider);
		renderer.render();
	}

}
