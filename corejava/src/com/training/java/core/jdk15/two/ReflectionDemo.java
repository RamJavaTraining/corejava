package com.training.java.core.jdk15.two;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionDemo {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		
		String className = "java.util.ArrayList";
		
		Class<?> clazz = Class.forName(className);
		
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println("Method name = " + method.getName());
		}
		
		Constructor<?>[] constructors = clazz.getDeclaredConstructors();
		for(Constructor<?> c : constructors)
		{
			System.out.println("Name = " + c.getName());
		}
		
	}

}
