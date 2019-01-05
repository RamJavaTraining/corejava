package com.training.java.core.jdk15.two;

import java.util.ArrayList;
import java.util.List;

public class OldStyleLists {
	
	public static List toList(Object[] elements)
	{
		List list = new ArrayList();
		
		for(Object obj : elements)
		{
			list.add(obj);
		}
		
		return list;
	}

}
