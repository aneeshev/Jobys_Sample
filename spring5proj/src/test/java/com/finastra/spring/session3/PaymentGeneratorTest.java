package com.finastra.spring.session3;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.PaymentGenerator;
import com.spring.session3.config.AppConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class PaymentGeneratorTest {
	
	@Autowired
	private List<PaymentGenerator> generators;
	
	@Test
	public void testGenerators() {
		//Arrays.stream(generators).forEach(i -> i.generate());
		generators.stream().forEach(i -> i.generate());
	}

}
