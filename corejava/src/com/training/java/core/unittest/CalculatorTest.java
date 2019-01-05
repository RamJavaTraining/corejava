package com.training.java.core.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest
{
	@Test
	public void testAdd()
	{
		int result = Calculator.add(5, 3);
		System.out.println("result = " + result);
		assertEquals("The addition of 5 and 3 should be 8", 8, result);
	}
	
	@Test
	public void testSubtract()
	{
		int result = Calculator.subtract(10, 20);
		assertEquals("10-20 should be -10", -10, result);
	}
	
	@Test 
	public void testDivide()
	{
		int result = Calculator.divide(10, 2);
		assertEquals("10/2 should be 5", 5, result);
	}
}
