package com.training.java.core.inheritance;

public class Car
{
	protected int currentSpeed;
	private boolean started;
	private String color;
	
	public Car()
	{
	}
	
	public Car(String color)
	{
		this.color = color;
	}

	public void start()
	{
		System.out.println("Car is starting");
		started = true;
	}
	
	public void stop()
	{
		System.out.println("Car is stopping");
		started = false;
	}
	
	public void accelerate(int increaseMiles)
	{
		currentSpeed += increaseMiles;
	}
	
	public void applyBrakes(int decreaseMiles)
	{
		currentSpeed -= decreaseMiles;
	}
	
	public void printInformation()
	{
		System.out.println("The color is " + color);
		System.out.println("The started flag is " + started);
		System.out.println("Current speed = " + currentSpeed);
	}
}
