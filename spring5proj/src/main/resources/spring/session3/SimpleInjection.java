package spring.session3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.finastra.spring.session3.beans.ioc.AnnotatedInjectSimple;
import com.finastra.spring.session3.beans.ioc.InjectSimple;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/spring/session3/app-context-ioc.xml"})
public class SimpleInjection {

	@Autowired
	private InjectSimple injectSimple;
	
	@Autowired
	private AnnotatedInjectSimple annotatedInjectSimple;
	
	@Test
	public void testSimpleInjection() {
		System.out.println(injectSimple);
		System.out.println(annotatedInjectSimple);
	}
}
