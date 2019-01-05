package com.training.java.core.jdk15.two;

public class PoliceCar implements Car {

	@Override
	public void start() {
		System.out.println("PoliceCae starts");
		
		for(int i=0; i<10; i++)
		{
			System.out.println("I am inside for loop");
		}
	}

	@Override
	public void stop() {
		System.out.println("PoliceCae stops");
	}

	@Override
	public void drive() {
		System.out.println("PoliceCae drives");
	}

}
