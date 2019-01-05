package com.training.java.core.abstractclass;

public class AbstractDemo
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Vehicle car = new Car();
		
		car.start();
		car.drive();
		car.stop();
	}

}
