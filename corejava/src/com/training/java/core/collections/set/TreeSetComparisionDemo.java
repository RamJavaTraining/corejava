package com.training.java.core.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparisionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create Head First Java Book
		Book headFirstJava = new Book();
		headFirstJava.setAuthor("Cathy Sierra");
		headFirstJava.setNumberOfPages(496);
		headFirstJava.setPublisher("Orielly");
		headFirstJava.setTitle("Head First Java");

		// Create Hibernate in Action Book
		Book hibernateInAction = new Book();
		hibernateInAction.setAuthor("Gavin King");
		hibernateInAction.setNumberOfPages(265);
		hibernateInAction.setPublisher("Manning");
		hibernateInAction.setTitle("Hibernate in Action");

		// Create Spring in Action Book
		Book springInAction = new Book();
		springInAction.setAuthor("Craig Walls");
		springInAction.setNumberOfPages(356);
		springInAction.setPublisher("Manning");
		springInAction.setTitle("Spring in Action");

		// Now, add all these 3 books to Set, which is a TreeSet
		Set<Book> books = new TreeSet<Book>();
		books.add(headFirstJava);
		books.add(hibernateInAction);
		books.add(springInAction);

		// Now, lets read the books from Set and print them. Observe that it has
		// been sorted by author (that is what we mentioned in our compareTo()
		// method in Book class).

		for (Book aBook : books) {
			System.out.println("*************************************");
			System.out.println("Author = " + aBook.getAuthor());
			System.out.println("Title = " + aBook.getTitle());
			System.out.println("Publisher = " + aBook.getPublisher());
			System.out.println("Number of pages = " + aBook.getNumberOfPages());
			System.out.println("*************************************");
			System.out.println();
		}
	}

}
