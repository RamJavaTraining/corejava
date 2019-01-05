package com.training.java.core.enums;

public class FruitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FruitDescriptor desc = new FruitDescriptor();
		String color = desc.getColor(Fruit.APPLE);
		
		System.out.println("Fruit color = " + color);
		
	}

}
