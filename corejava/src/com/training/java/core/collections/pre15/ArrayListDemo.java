package com.training.java.core.collections.pre15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create a container
		List names = new ArrayList();
		
		names.add("Ram");
		names.add("Jiten");
		names.add("Manpreet");
		names.add("Priya");
		names.add("Rinku");
		names.add("Ronnie");
		names.add("Sasikala");
		names.add("Yousuf");
		
		Iterator namesIterator = names.iterator();
		
		while(namesIterator.hasNext())
		{
			String name = (String) namesIterator.next();
			
			System.out.println("name = " + name);
		}
	}

}
