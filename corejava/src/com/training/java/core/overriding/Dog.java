package com.training.java.core.overriding;

public class Dog extends Animal
{
	private boolean sniffer;

	public Dog(int numberofLegs, boolean tail, boolean horns, boolean wild,
			boolean sniffer)
	{
		super(numberofLegs, tail, horns, wild);
		this.sniffer = sniffer;
	}
	
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
