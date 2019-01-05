package com.training.java.core.overriding;

public class AnimalDemo
{
	/**
	 * @param args.
	 */
	public static void main(String[] args)
	{
		//The most straight forward scenario
		Animal a = new Animal(4,true,false,true);
		a.eat("carrots");
		a.run(30, 10);
		a.makeSound();
		
		Dog tommy = new Dog(4,true,false,false,false);
		tommy.eat("apple");
		tommy.run(100, 10);
		tommy.makeSound();
		tommy.bark();
		
		Bear b= new Bear(4,true,false,true, true, "Polar",false);
		b.eat("honey");
		b.kill("deer");
		b.getInfo();
		
		int count = Animal.getAnimalCount();
		System.out.println("number of animals "  + count);

	}

}
