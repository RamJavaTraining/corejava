package com.training.java.core.jdk15;

import java.util.ArrayList;
import java.util.List;

public class BoxingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> ages = new ArrayList<Integer>();
		
		////Compiler boxed int primitives into Integer objects
		ages.add(23);
		ages.add(22);
		ages.add(28);
		
		int[] ageArray = new int[3];
		
		for(int i=0; i<ages.size(); i++)
		{
			//Compiler unboxed Integer object into int primitive
			ageArray[i] = ages.get(i);
		}
		
	}

}
