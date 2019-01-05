package com.training.java.core.equals;

public class EqualsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String firstName1 = new String("Fahmee");
		String firstName2 = new String("fahmee");
		
		boolean equals = (firstName1.equals(firstName2));
		
		System.out.println("Are objects equal? " + equals);
		
		
		Car car1 = new Car("1234", "Ford", "Focus");
		Car car2 = new Car("8765", "Ford", "Focus");
		
		boolean carsEqual = car1.equals("Ram");
				
		System.out.println("Are these two cars equal? " + carsEqual);
		
	}

}
