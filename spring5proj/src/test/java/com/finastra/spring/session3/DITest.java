package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.ioc.InjectSimple;
import com.spring.session3.beans.ioc.Parent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context-ioc.xml"})
public class DITest {

	@Autowired
	private Parent parent;
	
	@Autowired
	InjectSimple injectSimpleSpel;
	
	@Test
	public void testConstructorInjection() {
		System.out.println(parent.getChild().getName());
		System.out.println(injectSimpleSpel.toString()); // SPELT Test.
	}
	
}
