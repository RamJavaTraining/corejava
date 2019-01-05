package com.training.java.core.jdk15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class ListsTest {
	
	@Test
	public void testToList() {
		String[] names = {"Ram", "Jiten", "Manpreet"};
		
		Lists l = new Lists();
		List<String> namesList = l.toList(names);
		
		assertNotNull(namesList);
		assertEquals(names.length, namesList.size());
		
		for(String aName : namesList)
		{
			System.out.println("aName = " + aName);
		}
	}

}
