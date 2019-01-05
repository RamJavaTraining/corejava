package com.training.java.core.operators;

/**
 * The + operator can also be used for concatenating (joining) two strings
 * together, as shown in this example.
 * 
 * @author Ram
 * 
 */
public class ConcatenationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String firstPart = "Any intelligent fool can make things bigger, more complex, and more violent.";
		String secondPart = "It takes a touch of genius -- and a lot of courage -- ";
		String thirdPart = "to move in the opposite direction.";
		String fourthPart = " - Albert Einstein";
		
		String totalQuote = firstPart + secondPart + thirdPart + fourthPart;
		System.out.println(totalQuote);
	}

}
