package com.training.java.core.collections.post15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ImmutableBook headFirstJava = new ImmutableBook("Head First Java", "Cathy Sierra", "12345");
		ImmutableBook springInAction = new ImmutableBook("Spring in Action", "Cariag Walls", "54321");
		ImmutableBook hibernateInAction = new ImmutableBook("Hibernate in Action", "Gavin King", "99999");
		ImmutableBook jqueryInActon = new ImmutableBook("jQuery in Action", "Ram Ram", "98765");

		List<ImmutableBook> books = new ArrayList<ImmutableBook>();

		books.add(headFirstJava);
		books.add(springInAction);
		books.add(hibernateInAction);
		books.add(jqueryInActon);
		
		for(ImmutableBook aBook : books)
		{
			System.out.println("Start printing book details *******");
			System.out.println("Author = " + aBook.getAuthor());
			System.out.println("Title = " + aBook.getTitle());
			System.out.println("ISBN = " + aBook.getIsbn());
			System.out.println("End printing book details *******");
		}
	}

}
