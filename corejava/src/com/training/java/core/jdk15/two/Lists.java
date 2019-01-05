package com.training.java.core.jdk15.two;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	public static <T> List<T> toList(T... elements)
	{
		List<T> list = new ArrayList<T>();
		
		for(T anElement : elements)
		{
			list.add(anElement);
		}
		
		return list;
	}

}
