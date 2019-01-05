package com.training.java.core.jdk15.two;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
	
	@CustomTest(enabled="true")
	public void testAdd()
	{
		Calculator c = new Calculator();
		int result = (int) c.add(5, 3);
		
		assertEquals(8, result);
		
		System.out.println("Result = " + result);
	}
	
	@CustomTest(enabled="true")
	public void testSub()
	{
		
	}

	public void testMultiply()
	{
		
	}
	
	@CustomTest(enabled="true")
	public void testDivide()
	{
		
	}

}
