package com.training.java.core.abstractclass;

/**
 * @author Ram
 *
 */
public abstract class Vehicle
{
	/**
	 * This is a concrete method.
	 */
	public void start()
	{
		System.out.println("Vehicle is starting");
	}

	/**
	 * This is a concrete method.
	 */
	public void stop()
	{
		System.out.println("Vehicle is stopping");
	}

	/**
	 * Since we think every vehicle drives differently, we make it abstract.
	 */
	public abstract void drive();

}
