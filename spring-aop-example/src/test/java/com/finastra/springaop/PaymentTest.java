package com.finastra.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springaop.Flow1;
import com.springaop.Flow2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/applicationContext.xml")
public class PaymentTest {

	@Autowired
	Flow2 creditCardPayment;
	
	@Autowired
	Flow1 achPayment;
	
	@Test
	public void testCreditCard() {
		creditCardPayment.validateCard();
		creditCardPayment.doPayment();
		creditCardPayment.getPayment();
//		creditCardPayment.getIntValue();
//		try {
//		creditCardPayment.divisionOfTen(0);
//		} catch(Exception e) {
//			
//		}
		
		achPayment.doAchPayment();
		achPayment.getPayment();
	}
}
