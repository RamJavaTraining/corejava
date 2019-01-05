package com.training.java.core.overriding;

public class Animal
{
	private static int animalNumber;
	private int numberOfLegs;
	private boolean tail;
	private boolean horns;
	private boolean wild;
	private String color;
	private int age;
	private boolean veggie;
	private boolean bite;
	protected boolean hungry;
	private boolean distracted;
	private String currentState;
	
	public Animal(int numberofLegs, boolean tail, boolean horns, boolean wild)
	{
		this.numberOfLegs = numberofLegs;
		this.tail = tail;
		this.horns = horns;
		this.wild = wild;
		animalNumber++;
	}
	public static int getAnimalCount()
	{
		return animalNumber; 
	}

	public void eat(String food)
	{
		System.out.println("I am eating " + food);
		hungry = false;
	}

	public void distract(String how)
	{
		System.out.println("Damn it, I got distracted by " + how);
		distracted = true;
	}

	public void sleep(int numberOfHours)
	{
		if (distracted)
		{
			System.out.println("I am distracted, so I can't sleep");
		} else
		{
			System.out.println("I am sleeping for " + numberOfHours + " hours");
		}
	}

	public void run(int speed, int minutes)
	{
		System.out.println("I am running at " + speed + " miles per hour for "
				+ minutes + " minutes");
		currentState="Running";
	}

	public void makeSound()
	{
		System.out.println("I am making sound");
	}
}
