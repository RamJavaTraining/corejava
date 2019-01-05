package com.training.java.core.staticexample;

public class Car {
	
	private String color;
	private String vinNumber;
	
	private static int numberOfCarsCreated;
	public static final int MAX_SPEED_LIMIT = 140;
	
	public Car()
	{
		numberOfCarsCreated++;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	
	public static int getNumberOfCarsCreated()
	{
		return numberOfCarsCreated;
	}

}
