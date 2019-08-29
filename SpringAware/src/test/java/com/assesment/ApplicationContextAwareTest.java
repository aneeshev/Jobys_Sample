package com.assesment;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.assesment.call.Processor;
import com.assesment.call.Reader;
import com.assesment.impl.AnnotatedProcessor;
import com.assesment.impl.AnnotatedReader;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ApplicationContextAwareTest.Config.class})
public class ApplicationContextAwareTest {

	@ComponentScan(basePackages = {"com.assesment"})
	@Configuration
	public static class Config {
		
		@Bean
		public Processor processor() {
			return new AnnotatedProcessor();
		}
		
		@Bean
		public Reader annotatedReader() {
			return new AnnotatedReader();
		}
		
	}
	
	@Autowired
	private Processor processor;
	
	@Test
	public void testDeps() {
		processor.process();
	}

}
