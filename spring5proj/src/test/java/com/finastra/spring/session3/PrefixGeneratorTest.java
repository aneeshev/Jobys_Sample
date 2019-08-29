package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.prefix.PrefixGenerator;
import com.spring.session3.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class})
public class PrefixGeneratorTest {

	@Autowired
	private PrefixGenerator generator;
	
	@Test
	public void testGenerator() {
		System.out.println(generator.getPrefix());
	}
	
}
