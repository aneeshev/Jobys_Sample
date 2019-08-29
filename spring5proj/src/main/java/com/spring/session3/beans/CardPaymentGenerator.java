package com.spring.session3.beans;

import org.springframework.stereotype.Service;

@Service
public class CardPaymentGenerator implements PaymentGenerator{

	@Override
	public String name() {
		return "CardPaymentGenerator";
	}

	@Override
	public void generate() {
		System.out.println("CardPaymentGenerator");
	}

}
