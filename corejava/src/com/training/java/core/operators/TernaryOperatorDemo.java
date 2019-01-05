package com.training.java.core.operators;

/**
 * Another conditional operator is ?:, which can be thought of as shorthand for
 * an if-then-else statement. This operator is also known as the ternary
 * operator because it uses three operands. In the following example, this
 * operator should be read as:
 * "If someCondition is true, assign the value of value1 to result. Otherwise, assign the value of value2 to result."
 * 
 * @author Ram
 * 
 */
public class TernaryOperatorDemo {

	public static void main(String[] args) {

		int value1 = 1;
		int value2 = 2;
		int result;

		boolean someCondition = true;
		result = someCondition ? value1 : value2;

		System.out.println(result);

	}
}
