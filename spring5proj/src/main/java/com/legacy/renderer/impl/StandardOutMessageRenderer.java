package com.legacy.renderer.impl;

import com.legacy.provider.MessageProvider;
import com.legacy.renderer.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;
	
	@Override
	public void render() {
		if(messageProvider != null)
			System.out.println(messageProvider.message());
		else
			System.out.println("Error : Cann't render message as Message Provider is not set");
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}


}
