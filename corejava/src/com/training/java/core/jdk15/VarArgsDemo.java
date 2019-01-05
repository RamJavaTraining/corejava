package com.training.java.core.jdk15;


public class VarArgsDemo {
	
	public void print(String city, String... names)
	{
		for(String eachName : names)
		{
			System.out.println("each name = " + eachName);
		}
	}
	
	public static void main(String[] args) {
		VarArgsDemo demo = new VarArgsDemo();
		
		demo.print("Troy", "Rinku", "Ronnie", "Yousuf", "Sasi");
	}

}
