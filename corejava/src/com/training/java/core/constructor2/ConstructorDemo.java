package com.training.java.core.constructor2;

public class ConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car = new Car("12345", "Ford", "Focus");
		
		car.setColor("Blue");
		
		System.out.println("Vin number = " + car.getVinNumber());
		System.out.println("Color = " + car.getColor());
	}

}
