package com.training.java.core.staticexample;

public class StaticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car camry = new Car();
		camry.setColor("Blue");
		camry.setVinNumber("12345");
		
		Car focus = new Car();
		focus.setColor("Red");
		focus.setVinNumber("98765");
		
		System.out.println("vin number of camry = " + camry.getVinNumber());
		System.out.println("color of focus = " + focus.getColor());
		
		System.out.println("Max speed limit is " + Car.MAX_SPEED_LIMIT);
		System.out.println("No of cars created = " + Car.getNumberOfCarsCreated());
		
		
	}

}
