package com.spring.session3.beans.prefix;

public interface PrefixGenerator {

	public default String getPrefix() {
		return "###"; 	
	}
	
}
