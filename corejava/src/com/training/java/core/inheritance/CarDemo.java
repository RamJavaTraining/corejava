package com.training.java.core.inheritance;

public class CarDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SportsCar car = new SportsCar();
		
		car.start();
		car.accelerate(20);
		car.applyBrakes(10);
		car.printInformation();
		
		car.nitro();
		car.printInformation();
	}

}
