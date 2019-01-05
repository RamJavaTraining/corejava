package com.training.java.core.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SimpleLinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> states = new LinkedHashSet<String>();

		states.add("TX");
		states.add("OH");
		states.add("MI");
		states.add("MI");
		states.add("AB");
		states.add("CO");
		states.add(null);

		// Observe the output carefully. In the case of LinkedHashSet, it stores
		// in the order you placed in the Set. It keeps that order.Also observe
		// that the duplicated element MI is not being printed, because Sets
		// don't support duplicate values. Also observe that LinkedHashSet (sub
		// class of HashSet) accepts null values.

		for (String aState : states) {
			System.out.println("aState = " + aState);
		}
	}

}
