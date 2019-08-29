package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.ioc.InjectSimpleSpel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context-spel.xml"})
public class SPELTest {
	
	@Autowired
	private InjectSimpleSpel injectSimpleSpel;
	
	@Test
	public void testSPEL() {
		System.out.println(injectSimpleSpel);
	}

}
