package com.training.java.core.jdk15;

import java.lang.reflect.Method;

public class TestRunner {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		Class className = Class.forName("com.training.java.core.jdk15.SampleTestClass1");
		
		Method[] methods = className.getDeclaredMethods();
		
		for(Method aMethod : methods)
		{
			if(aMethod.getAnnotation(Test.class) != null)
			{
				System.out.println("Annotation exists on method " + aMethod.getName());
			}
			else
			{
				System.out.println("Annotation does NOT exist on method " + aMethod.getName());
			}
		}
		
		
	}

}
