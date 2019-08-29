package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.NamedSinger;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {BeanNameAwareTest.Config.class})
public class BeanNameAwareTest {
	
	@Configuration
	public static class Config {
		
		@Bean
		public NamedSinger singer() {
			return new NamedSinger();
		}
		
	}

	@Autowired
	private NamedSinger singer;
	
	@Test
	public void testBeanNameAware() {
		singer.sing();
	}
	
}
