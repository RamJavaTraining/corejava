package com.training.java.core.jdk15.two;

public class CalendarClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String day = Calendar.getDescriptiveDayOfWeek(DayOfWeek.TUESDAY);
		System.out.println("day of week = " + day);
		
	}

}
