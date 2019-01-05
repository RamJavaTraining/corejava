package com.training.java.core.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayDominator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] testNumbers = {2, 8, 8, 8, 8, 8, 2};
		
		int dominator = getDomainator(testNumbers);
		System.out.println("dominator = " + dominator);
	}
	
	private static int getDomainator(int[] array)
	{
		int halfSize = array.length/2;
		Map<Integer, Integer> valueAndSizeMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<array.length; i++)
		{
			if(valueAndSizeMap.get(array[i]) == null)
			{
				valueAndSizeMap.put(array[i], 1);
			}
			else
			{
				int currentSize = valueAndSizeMap.get(array[i]);
				valueAndSizeMap.put(array[i], ++currentSize);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry :  valueAndSizeMap.entrySet())
		{
			System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
			if(entry.getValue() > halfSize)
			{
				return entry.getKey();
			}
		}
		
		return -1;
	}
}
