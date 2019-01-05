package com.training.java.core.interfaces;

public class Car implements Vehicle
{
	public void drive()
	{
		System.out.println("Car is driving..");
	}

	public void start() {
		System.out.println("Car is starting..");		
	}

	public void stop() {
		System.out.println("Car is stopping..");		
	}
}
