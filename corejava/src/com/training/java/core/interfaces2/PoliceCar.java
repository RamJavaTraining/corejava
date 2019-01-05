package com.training.java.core.interfaces2;

public class PoliceCar implements Car {

	@Override
	public void start() {
		System.out.println("PoliceCar is starting");
	}

	@Override
	public void stop() {
		System.out.println("PoliceCar is stopping");

	}

	@Override
	public void drive() {
		System.out.println("PoliceCar is driving");
	}

}
