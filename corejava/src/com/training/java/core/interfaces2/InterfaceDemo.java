package com.training.java.core.interfaces2;

public class InterfaceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new RaceCar();
		
		car.start();
		car.drive();
		car.stop();
	}

}
