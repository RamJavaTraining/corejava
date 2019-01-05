package com.training.java.core.operators;

/**
 * Very straight forward example. The only thing that needs to be observed here
 * is to use "==" for equality, not "=". "=" is an assignment operator that is
 * used to assign value to a variable.
 * 
 * @author Ram
 * 
 */
class ComparisonDemo {

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;

		if (value1 == value2)
			System.out.println("value1 == value2");

		if (value1 != value2)
			System.out.println("value1 != value2");

		if (value1 > value2)
			System.out.println("value1 > value2");

		if (value1 < value2)
			System.out.println("value1 < value2");

		if (value1 <= value2)
			System.out.println("value1 <= value2");
	}
}
