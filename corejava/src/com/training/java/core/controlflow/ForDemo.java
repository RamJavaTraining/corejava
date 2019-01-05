package com.training.java.core.controlflow;

/**
 * The for statement provides a compact way to iterate over a range of values.
 * Programmers often refer to it as the "for loop" because of the way in which
 * it repeatedly loops until a particular condition is satisfied. The general
 * form of the for statement can be expressed as follows: for (initialization;
 * termination; increment) { statement(s) } When using this version of the for
 * statement, keep in mind that: The initialization expression initializes the
 * loop; it's executed once, as the loop begins. When the termination expression
 * evaluates to false, the loop terminates. The increment expression is invoked
 * after each iteration through the loop; it is perfectly acceptable for this
 * expression to increment or decrement a value..
 * 
 * @author Ram
 * 
 */
public class ForDemo {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			System.out.println("Count is: " + i);
		}
	}
}
