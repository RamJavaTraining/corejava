package com.training.java.core.jdk15.two;

public class Calendar {
	
	public static String getDescriptiveDayOfWeek(DayOfWeek dayOfWeek)
	{
		if(dayOfWeek == DayOfWeek.MONDAY)
		{
			return "Monday";
		}
		else if(dayOfWeek == DayOfWeek.TUESDAY)
		{
			return "Tuesday";
		}
		else if(dayOfWeek == DayOfWeek.WEDNESDAY)
		{
			return "Wed";
		}
		else if(dayOfWeek == DayOfWeek.THURSDAY)
		{
			return "Thu";
		}
		else if(dayOfWeek == DayOfWeek.FRIDAY)
		{
			return "Fri";
		}
		else if(dayOfWeek == DayOfWeek.SATURDAY)
		{
			return "Sat";
		}
		else 
		{
			return "Sunday";
		}
	}

}
