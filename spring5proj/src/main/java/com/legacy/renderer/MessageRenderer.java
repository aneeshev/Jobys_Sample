package com.legacy.renderer;

import com.legacy.provider.MessageProvider;

public interface MessageRenderer {

	public void render();
	public void setMessageProvider(MessageProvider provider);
	public MessageProvider getMessageProvider();

}
