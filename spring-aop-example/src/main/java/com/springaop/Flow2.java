package com.springaop;

import java.util.HashMap;
import java.util.Map;


public class Flow2 {
	public Map do() {
		System.out.println("dyment for credit card");
		return new HashMap() {
			{
				put("success", "true");
			}
		};
	}

	 Map get() {
		System.out.println("getting  of credit card");
		return new HashMap() {
			{
				put("success", "true");
//				put("data", "100");
			}
		};
	}
	 
	 int getIntValue() {
		 return 0;
	 }

	 Map validateCard() {
		System.out.println("Validating card");
		return new HashMap() {
			{
				put("success", "true");
			}
		};
	}
	
	public void divisionOfTen(int i) {
		System.out.println(10/0);
	}
}
