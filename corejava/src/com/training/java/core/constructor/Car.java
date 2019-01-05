package com.training.java.core.constructor;

public class Car {

	private String color;
	private int numberOfGears;
	private int maximumSpeed = 140;
	private int currentSpeed;
	private String vinNumber;

	public Car(String color, int numberOfGears) {
		this.color = color;
		this.numberOfGears = numberOfGears;
	}

	public Car(String color, int numberOfGears, String vinNumber) {
		this.color = color;
		this.numberOfGears = numberOfGears;
		this.vinNumber = vinNumber;
	}

	public void start() {
		System.out.println("Starting " + color + " color car with "
				+ numberOfGears + " gears with VIN = " + vinNumber);
	}

	public void stop() {
		System.out.println("Stopping");
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setNumberOfGears(int numberOfGears)
	{
		this.numberOfGears = numberOfGears;
	}
}
