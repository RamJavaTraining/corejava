package com.training.java.core.encapsulation;

public class TelevisionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Television tv = new Television();
		tv.setColor("Black");
		tv.setMake("Samsung");
		tv.setModel("LNS3251D");
		
		System.out.println("Model = " + tv.getModel());
		System.out.println("Make = " + tv.getMake());
		System.out.println("Color = " + tv.getColor());
	}

}
