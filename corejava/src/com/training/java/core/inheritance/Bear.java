package com.training.java.core.inheritance;

public class Bear extends Animal
{
	private boolean killer;
	private String kind;
	private boolean trained;
	
	public Bear(int numberofLegs, boolean tail, boolean horns, boolean wild, 
			boolean killer, String kind, boolean trained)
	{
		super(numberofLegs, tail, horns, wild);
		this.killer = killer;
		this.kind = kind;
		this.trained = trained;
	}
	
	public void kill(String what)
	{
		System.out.println("I killed " + what);
	}
	
	public void getInfo()
	{
		System.out.println("Killer = " + killer);
		System.out.println("Kind = " + kind);
		System.out.println("Trained = " + trained);
	}
}
