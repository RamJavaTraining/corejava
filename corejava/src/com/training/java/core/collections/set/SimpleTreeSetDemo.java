package com.training.java.core.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class SimpleTreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> states = new TreeSet<String>();

		states.add("TX");
		states.add("OH");
		states.add("MI");
		states.add("MI");
		states.add("AB");
		states.add("CO");

		// TreeSet does NOT support null, if you try to add
		// null, it throws NullPointerException

		// states.add(null);

		// Observe the output carefully. In the case of TreeSet, it prints in
		// the natural order of values. For Strings, the order is alphabetical,
		// for numbers it is natural number order.Also observe
		// that the duplicated element MI is not being printed, because Sets
		// don't support duplicate values. Also observe that TreeSet does NOT
		// accept null.

		for (String aState : states) {
			System.out.println("aState = " + aState);
		}
	}

}
