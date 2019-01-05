package com.training.java.core.arrays;

/**
 * In this example, we will learn how to declare an Array, creating and
 * initializing an array, adding elements to an array and read from an array...
 * 
 * 
 * @author Ram
 * 
 */
public class ArrayDemo1 {

	public static void main(String[] args) {

		// How to declare an array of Strings
		String[] states;

		// How to create an array? Arrays are created using new operator. Here,
		// we want to create an array of states that holds up to 10 Strings.
		states = new String[10];
		
		//Now, how to assign values to the array elements?
		states[0] = "MI";
		states[1] = "OH";
		states[2] = "CA";
		states[3] = "FL";		
		states[4] = "MO";
		states[5] = "OK";
		states[6] = "TX";
		states[7] = "FL";
		states[8] = "IL";
		states[9] = "WI";
		
		//We have an array that have 10 elements. Now, how do I read the array elements? We read them using index. How can I read 7th element in the array?
		String seventhState = states[6];
		
		System.out.println("Seventh state in states array is " + seventhState);
	}
}
