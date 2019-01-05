package com.training.java.core.oop.basic;

/**
 * Every object has state and behavior. Object stores its state in fields
 * (variables). Remember, this is a class (blue print) not an actual instance
 * (object). So creating an actual instance of this class is not this classes's
 * job. Also this class doesn't have main method, so you cannot run (execute)
 * this class.
 * 
 * @author Ram
 * 
 */
public class Car {

	// Car stores its state in fields..these are all state information.
	int currentSpeed = 0;
	boolean started = false;

	// Behaviors are methods..See how behaviors (methods) change the state
	// (fields).

	void speedUp(int increment) {
		currentSpeed = currentSpeed + increment;
	}

	void applyBrakes(int decrement) {
		currentSpeed = currentSpeed - decrement;
	}

	void start() {
		started = true;
	}

	void stop() {
		started = false;
		currentSpeed = 0;
	}

	void printInfo() {
		System.out.println("Car started = " + started);
		System.out.println("Current speed = " + currentSpeed);
	}
}
