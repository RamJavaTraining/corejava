package com.training.java.core.interfaces;

/**
 * In the interface example, we think starting, stopping and driving a vehicle
 * is entirely different in each vehicle. So we don't give any concrete any
 * implementation in Vehicle. We design it as an interface and in interface all
 * methods are by default abstract. Also, we don't need to declare them as
 * abstract. Car and other vehicles can implement these abstract methods and
 * give their implementation.
 * 
 * @author Ram
 * 
 */
public interface Vehicle {
	void start();

	void stop();

	void drive();
}
