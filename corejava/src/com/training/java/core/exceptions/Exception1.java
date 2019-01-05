package com.training.java.core.exceptions;

public class Exception1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			System.out.println("First argument is " + args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
		
		System.out.println("Hello");
		System.out.println("How are ");
		
	}

}
