package com.springaop;

import java.util.HashMap;
import java.util.Map;


public class Flow1 {
	public Map doAch() {
		System.out.println("doing ach ");
		return new HashMap() {
			{
				put("success", "true");
			}
		};
	}

	public Map get() {
		System.out.println("getting ach ");
		return new HashMap() {
			{
				put("success", "true");
//				put("", "100");
			}
		};
	}
}
