package com.training.java.core.jdk15.two;

import java.util.Arrays;
import java.util.List;


public class ListsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new PoliceCar();
		Car car2 = new PoliceCar();
		Car car3 = new PoliceCar();
		
		List<Car> carsList = Arrays.asList(car1, car2, car3);
		
		for(Car aCar : carsList)
		{
			aCar.drive();
		}
		
		List<String> namesList = Arrays.asList("Leanid", "Ankita", "Sheeba");
		for(String name : namesList)
		{
			System.out.println("Name = " + name);
		}
	}
}
