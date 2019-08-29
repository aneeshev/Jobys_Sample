package com.finastra.spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.session3.beans.ioc.CollectionInjection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context-collection.xml"})
public class CollectionInjectionTest {

	@Autowired
	private CollectionInjection collectionInjection;
	
	@Test
	public void testCollectionInjection() {
		collectionInjection.displayInfo();
	}
	
}
