package com.training.java.core.jdk15;

import java.util.ArrayList;
import java.util.List;

public class Lists {
	
	public <T> List<T> toList(T[] array)
	{
		List<T> list = new ArrayList<T>();
		
		for(T current : array)
		{
			list.add(current);
		}
		
		return list;
	}

}
