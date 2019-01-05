package com.training.java.core.collections.post15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a container
		List<String> names = new ArrayList<String>();
		
		names.add("Ram");
		names.add("Jiten");
		names.add("Manpreet");
		names.add("Priya");
		names.add("Rinku");
		names.add("Ronnie");
		names.add("Sasikala");
		names.add("Yousuf");
		
		//Read with for each loop
		for(String aName : names)
		{
			System.out.println("name = " + aName);
		}
	}

}
