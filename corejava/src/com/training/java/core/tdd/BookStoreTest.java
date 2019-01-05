package com.training.java.core.tdd;

import java.util.List;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {
	
	private BookStore store;
	
	@Before
	public void init()
	{
		store = new BookStore();
	}
	
	@After
	public void teardown()
	{
		store = null;
	}
	

	@Test
	public void getAllBooksShouldNotReturnNull() {
		List<Book> books = store.getAllBooks();
		Assert.assertNotNull(books);
	}

	@Test
	public void getAllBooksShouldReturnAtleaseOneBook() {
		List<Book> books = store.getAllBooks();

		Assert.assertFalse("books should not be empty", books.isEmpty());
	}

	@Test
	public void get_all_books_should_return_a_head_first_java_book() {
		List<Book> books = store.getAllBooks();

		boolean headFirstJavaBookFound = false;
		for (Book aBook : books) {
			if (aBook.getTitle().equals("Head First Java")) {
				headFirstJavaBookFound = true;
			}
		}

		Assert.assertTrue("Head First Java book not found",
				headFirstJavaBookFound);
	}

	@Test
	public void add_spring_in_action_book_should_add_to_store() {

		Book aBook = new Book();
		aBook.setTitle("Spring in Action");
		
		store.add(aBook);

		List<Book> allBooksFromStore = store.getAllBooks();

		boolean isMyBookFound = false;
		for (Book current : allBooksFromStore) {
			if (current.getTitle().equals("Spring in Action")) {
				isMyBookFound = true;
			}
		}

		Assert.assertTrue("Spring in Action book not found", isMyBookFound);
	}

	@Test
	public void no_book_from_store_exist_without_title() {
		List<Book> allBooksFromStore = store.getAllBooks();
		
		for(Book current : allBooksFromStore)
		{
			if(current.getTitle() == null || current.getTitle().length() == 0)
			{
				TestCase.fail("Every book should have a title");
			}
		}
	}

}
