package com.training.java.core.helloworld;

/**
 * This class expects the user of this program to enter his/her first and last
 * name. It then wishes him/her with a personalized message. You can learn how
 * to pass and read arguments to main method.
 * 
 * @author Ram
 * 
 */
public class HelloWorldWithArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Read the arguments that are passed to main method into variables.
		String firstName = args[0];
		String lastName = args[1];
		
		//Now, print a personalized Hello. Also realize how we use + operator to concatenate 2 Strings.
		
		System.out.println("Hello " + firstName + " " + lastName);
	}
}
