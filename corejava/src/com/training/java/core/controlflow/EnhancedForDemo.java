package com.training.java.core.controlflow;

/**
 * The for statement also has another form designed for iteration through
 * Collections and arrays. This form is sometimes referred to as the enhanced
 * for statement, and can be used to make your loops more compact and easy to
 * read. To demonstrate, consider the following array, which holds the numbers 1
 * through 10:
 * 
 * @author Ram
 * 
 */
public class EnhancedForDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int item : numbers) {
			System.out.println("Count is: " + item);
		}
	}
}