package com.training.java.core.jdk15.two;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> ages = new ArrayList<Integer>();
		ages.add(24);
		ages.add(32);
		ages.add(56);
		
		int[] primitiveAges = new int[3];
		
		for(int i=0; i< ages.size(); i++)
		{
			primitiveAges[i] = ages.get(i);
		}
		
		for(int i=0; i< primitiveAges.length; i++)
		{
			System.out.println("Age = " + primitiveAges[i]);
		}
		
	}

}
