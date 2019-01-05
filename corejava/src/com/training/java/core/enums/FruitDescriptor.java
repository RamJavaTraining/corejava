package com.training.java.core.enums;

public class FruitDescriptor {
	
	public String getColor(Fruit fruit)
	{
		if(fruit == Fruit.APPLE)
		{
			return "red";
		}
		else if(fruit == Fruit.ORANGE)
		{
			return "orange";
		}
		else if(fruit == Fruit.BANANA)
		{
			return "yellow";
		}
		
		return null;
	}

}
