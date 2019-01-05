package com.training.java.core.jdk15.two;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomTestFramework {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> clazz = Class.forName(args[0]);
		
		Field[] fields = clazz.getDeclaredFields();
		
		
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods)
		{
			if (method.getAnnotation(CustomTest.class) != null)
			{
				System.out.println("Yes, I found the test case, and its name = " + method.getName());
			}
		}
	}

}
