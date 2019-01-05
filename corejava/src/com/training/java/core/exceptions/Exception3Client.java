package com.training.java.core.exceptions;

import java.io.IOException;

public class Exception3Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Exception3 exc = new Exception3();
		
		try {
			exc.print();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
