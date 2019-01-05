package com.training.java.core.constructor;

public class RaceCarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new RaceCar("blue", 5, "Alluminimum");
		
		car.start();
		car.stop();
	}

}
