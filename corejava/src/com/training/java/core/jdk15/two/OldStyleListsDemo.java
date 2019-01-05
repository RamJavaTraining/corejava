package com.training.java.core.jdk15.two;

import java.util.Iterator;
import java.util.List;

public class OldStyleListsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] names = {"Tom", "Leanid", "Gunjan"};
		
		Car car1 = new PoliceCar();
		Car car2 = new PoliceCar();
		Car car3 = new PoliceCar();
		
		Car[] cars = {car1, car2, car3};
		
		List namesList = OldStyleLists.toList(cars);
		
		Iterator ite = namesList.iterator();
		while(ite.hasNext())
		{
			String name = (String) ite.next();
			System.out.println("Name = " + name);
		}
		
		
	}

}
