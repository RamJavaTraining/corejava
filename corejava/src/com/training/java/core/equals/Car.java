package com.training.java.core.equals;

public class Car {
	
	private String vinNumber;
	private String make;
	private String model;
	
	public Car(String vinNumber, String make, String model)
	{
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Car)
		{
			Car car2 = (Car) obj;
			return this.vinNumber.equals(car2.vinNumber);
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return vinNumber.hashCode() + make.hashCode() + model.hashCode();
	}

}
