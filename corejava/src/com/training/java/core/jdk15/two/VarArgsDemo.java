package com.training.java.core.jdk15.two;

public class VarArgsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printNames("Sheeba", "Nanda", "Mira", "Leanid", "Gunan", "Fahmee", "Alam");
		printAges(23, 56, 43, 24);
	}
	
	private static void printAges(int...ages) {
		for(int age : ages)
		{
			System.out.println("Age = " + age);
		}
	}

	public static void printNames(String type, String age, String... names)
	{
		for(String name : names)
		{
			System.out.println("Name = " + name);
		}
	}

}
