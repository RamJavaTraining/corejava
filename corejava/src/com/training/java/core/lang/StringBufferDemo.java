package com.training.java.core.lang;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuffer name = new StringBuffer();
		
		name.append("Ram");
		name.append(" Ram");
		
		System.out.println(name.toString());
		
	}

}
