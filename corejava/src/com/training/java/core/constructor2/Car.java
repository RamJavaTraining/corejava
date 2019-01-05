package com.training.java.core.constructor2;

public class Car {
	
	private String make;
	private String model;
	private String vinNumber;
	private String color;
	
    Car(String vinNumber, String color, String make, String model)
	{
		this.vinNumber = vinNumber;
		this.color = color;
		this.make = make;
		this.model = model;
	}
	
	Car(String vinNumber, String make, String model)
	{
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
	}
	
	String getMake() {
		return make;
	}

	String getModel() {
		return model;
	}

	String getVinNumber() {
		return vinNumber;
	}

	String getColor() {
		return color;
	}
	
	void setColor(String newColor)
	{
		color = newColor;
	}
}
