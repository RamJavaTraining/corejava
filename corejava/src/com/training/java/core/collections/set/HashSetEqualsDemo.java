package com.training.java.core.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEqualsDemo {

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
		Book headFirstJava2 = new Book();
		headFirstJava2.setAuthor("Cathy Sierra");
		headFirstJava2.setNumberOfPages(500);
		headFirstJava2.setPublisher("Manning");
		headFirstJava2.setTitle("Head First Java2");

		// Create Spring in Action Book
		Book springInAction = new Book();
		springInAction.setAuthor("Craig Walls");
		springInAction.setNumberOfPages(356);
		springInAction.setPublisher("Manning");
		springInAction.setTitle("Spring in Action");

		// Now, add all these 3 books to Set, which is a TreeSet
		Set<Book> books = new HashSet<Book>();
		books.add(headFirstJava);
		books.add(headFirstJava2);
		books.add(springInAction);

		// Now, lets read the books from Set and print them. Observe that only
		// one Head First Java book is printed because two book objects are
		// equal if they have the same autho (we overrode equals() and
		// hashCode() methods).

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
