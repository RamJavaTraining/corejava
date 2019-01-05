package com.training.java.core.lang;

public class ImmutabilityDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person sasi = new Person("Sasikala", "RajKumar", 20, "Troy");

		sasi.setAge(25);
		sasi.setCity("Rochester");

		System.out.println(sasi.getFirstName() + ", " + sasi.getLastName()
				+ ", " + sasi.getAge() + ", " + sasi.getCity());

		Person immutableSasi = new Person("Sasikala", "RajKumar", 20, "Troy");

		System.out.println(immutableSasi.getFirstName() + ", "
				+ immutableSasi.getLastName() + ", " + immutableSasi.getAge()
				+ ", " + immutableSasi.getCity());

	}

}
