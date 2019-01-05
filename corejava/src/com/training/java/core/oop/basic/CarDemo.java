package com.training.java.core.oop.basic;

/**
 * This class will create the actual instances (objects) of Car class. Since
 * this class has main method, we can run (execute) it.
 * 
 * @author Ram
 * 
 */
public class CarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a car
		Car car1 = new Car();
		
		//Start the car, speed up to 20 mph and then print the information
		car1.start();
		car1.speedUp(20);
		car1.printInfo();
		
		//Apply brakes by 5 mph and print the information
		car1.applyBrakes(5);
		car1.printInfo();
		
		//Stop the car now and print the information
		car1.stop();
		car1.printInfo();
	}

}
