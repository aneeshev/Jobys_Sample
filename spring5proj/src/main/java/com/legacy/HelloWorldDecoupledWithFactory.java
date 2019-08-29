package com.legacy;

import com.legacy.factory.MessageSupportFactory;
import com.legacy.provider.MessageProvider;
import com.legacy.renderer.MessageRenderer;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();
		MessageProvider provider = MessageSupportFactory.getInstance().getProvider();
		renderer.setMessageProvider(provider);
		renderer.render();
	}

}
