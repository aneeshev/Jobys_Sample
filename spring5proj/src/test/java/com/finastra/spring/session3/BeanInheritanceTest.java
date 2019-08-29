package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.Singer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context-inh.xml"})
public class BeanInheritanceTest {

	@Autowired
	private Singer parent;
	@Autowired
	private Singer child;
	
	@Test
	public void testBeanInheritance() {
		System.out.println(parent);
		System.out.println(child);
	}
	
}
