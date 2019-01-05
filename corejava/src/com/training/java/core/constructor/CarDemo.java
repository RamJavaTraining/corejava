package com.training.java.core.constructor;

public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car("blue", 5, "123456");
		
		car.start();
		car.stop();
		
		car.setColor("red");
		car.setNumberOfGears(6);
		
		car.start();
		car.stop();
		
	}

}
