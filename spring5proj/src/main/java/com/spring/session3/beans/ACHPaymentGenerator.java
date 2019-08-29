package com.spring.session3.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ACHPaymentGenerator implements PaymentGenerator {

	@Override
	public String name() {
		return "ACHPaymentGenerator";
	}

	@Override
	public void generate() {
		System.out.println("ACHPaymentGenerator");
	}

}
