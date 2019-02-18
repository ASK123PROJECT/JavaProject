package com.nt.first;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester=new MyClass();
		assertEquals("the Result is",2,tester.multiply(10, 5));
	}

	//@Test
	@Ignore
	public void testAdd() {
		MyClass tester2=new MyClass();
		assertEquals("the Result is",15,tester2.add(10, 5));
	}
}
