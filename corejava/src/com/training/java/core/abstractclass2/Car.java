package com.training.java.core.abstractclass2;

public abstract class Car {
	
	public void start()
	{
		System.out.println("Car is starting");
	}
	
	public void stop()
	{
		System.out.println("Car is stopping");
	}
	
	public abstract void drive();
}
