package com.training.java.core.jdk15.two;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection<String> names = new ArrayList<String>();
		names.add("Ankita");
		names.add("Gunjan");
		names.add("Kulsoom");
		
		for(String name : names)
		{
			System.out.println("Name = " + name);
		}
		
		//For each loop with Array
		String[] days = {"Monday", "Tuesday"};
		
		for(String day : days)
		{
			System.out.println("Day = " + day);
		}
	}

}
