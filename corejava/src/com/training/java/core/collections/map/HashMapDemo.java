package com.training.java.core.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Ram
 */
public class HashMapDemo
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Map<String, String> telephoneDirectory = new HashMap<String, String>();
		telephoneDirectory=null;
		telephoneDirectory.put("Ram", "2482295135");
		telephoneDirectory.put("prasad", "2482029187");
		telephoneDirectory.put("Soumith", "2482022951");
		
		//Method 1 to get keys and values
		Set<String> keySet = telephoneDirectory.keySet();
		
		for(String aKey : keySet)
		{
			System.out.println("A key = " + aKey);
			String value = telephoneDirectory.get(aKey);
			System.out.println("A Value = " + value);
		}
		
		//Method 2 to get keys and values
		Set<Entry<String, String>> entrySet = telephoneDirectory.entrySet();
		for(Entry<String, String> eachEntry : entrySet)
		{
			System.out.println("Key = " + eachEntry.getKey());
			System.out.println("Value = " + eachEntry.getValue());
		}
		
		
		String soumithsNumber = telephoneDirectory.get("Soumith");
		System.out.println("soumithsNumber = " + soumithsNumber);
	}

}
