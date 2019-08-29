package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.NamedSinger;
import com.spring.session3.beans.deps.Processor;
import com.spring.session3.beans.deps.Reader;
import com.spring.session3.beans.deps.impl.AnnotatedProcessor;
import com.spring.session3.beans.deps.impl.AnnotatedReader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context.xml"})
//@ContextConfiguration(classes= {ApplicationContextAwareTest.Config.class})
public class ApplicationContextAwareTest {

	@ComponentScan(basePackages = {"com.finastra.spring.session3.beans.deps"})
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
