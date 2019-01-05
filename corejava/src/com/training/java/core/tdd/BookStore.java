package com.training.java.core.tdd;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

	private List<Book> books = new ArrayList<Book>();
	
	public BookStore()
	{
		Book aBook = new Book();
		
		aBook.setTitle("Head First Java");
		
		books.add(aBook);
	}

	public List<Book> getAllBooks() {
		return books;
	}

	public void add(Book aBook) {
		books.add(aBook);
	}

}
