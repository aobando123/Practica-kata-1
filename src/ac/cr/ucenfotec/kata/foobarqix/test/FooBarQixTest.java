package ac.cr.ucenfotec.kata.foobarqix.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import ac.cr.ucenfotec.kata.foobarqix.FooBarQix;

public class FooBarQixTest {

	static FooBarQix fbq;
	@BeforeClass
	public static void init() {
		fbq = new FooBarQix();
	}
	
	@Test
	public void testFoo() {
		assertEquals("FOO", fbq.createFoo(9));
	}
	@Test
	public void testBar() {
		assertEquals("BAR", fbq.createFoo(10));
	}
	@Test
	public void testQix() {
		assertEquals("QIX", fbq.createFoo(14));
	}
	
	
	@Test 
	public void testFooBar() {
		assertEquals("FOO-BAR", fbq.createFoo(30));
	}
	
	@Test
	public void testFooBarQix() {
		assertEquals("FOO-BAR-QIX", fbq.createFoo(105));
	}
	
	

}
