package com.training.java.core.constructor;

public class RaceCar extends Car {
	
	private String gridMetal;
	
	public RaceCar(String color, int numberOfGears, String gridMetal)
	{
		super(color, numberOfGears);
		this.gridMetal = gridMetal;
	}
	
	public void start()
	{
		super.start();
		System.out.println("With gridMetal = " + gridMetal);
	}

}
