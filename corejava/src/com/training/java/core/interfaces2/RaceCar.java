package com.training.java.core.interfaces2;

public class RaceCar implements Car {

	@Override
	public void start() {
		System.out.println("Race car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Race car is stopping");
	}

	@Override
	public void drive() {
		System.out.println("Race car is driving..zoom zoom..");
	}

}
