package com.training.java.core.controlflow;

/**
 * Deciding whether to use if-then-else statements or a switch statement is
 * based on readability and the expression that the statement is testing. An
 * if-then-else statement can test expressions based on ranges of values or
 * conditions, whereas a switch statement tests expressions based only on a
 * single integer, enumerated value, or String object.
 * 
 * Another point of interest is the break statement. Each break statement
 * terminates the enclosing switch statement. Control flow continues with the
 * first statement following the switch block. The break statements are
 * necessary because without them, statements in switch blocks fall through: All
 * statements after the matching case label are executed in sequence, regardless
 * of the expression of subsequent case labels, until a break statement is
 * encountered. The program SwitchDemoFallThrough shows statements in a switch
 * block that fall through. The program displays the month corresponding to the
 * integer month and the months that follow in the year:
 * 
 * 
 * @author Ram
 * 
 */
public class SwitchDemoFallThrough {

	public static void main(String args[]) {
		java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();

		int month = 8;

		switch (month) {
		case 1:
			futureMonths.add("January");
		case 2:
			futureMonths.add("February");
		case 3:
			futureMonths.add("March");
		case 4:
			futureMonths.add("April");
		case 5:
			futureMonths.add("May");
		case 6:
			futureMonths.add("June");
		case 7:
			futureMonths.add("July");
		case 8:
			futureMonths.add("August");
		case 9:
			futureMonths.add("September");
		case 10:
			futureMonths.add("October");
		case 11:
			futureMonths.add("November");
		case 12:
			futureMonths.add("December");
			break;
		default:
			break;
		}

		if (futureMonths.isEmpty()) {
			System.out.println("Invalid month number");
		} else {
			for (String monthName : futureMonths) {
				System.out.println(monthName);
			}
		}
	}
}
