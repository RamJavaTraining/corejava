package com.training.java.core.collections.pre15;

public class ImmutableBook {
	
	private String title;
	private String author;
	private String isbn;

	public ImmutableBook(String title, String author, String isbn)
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
}
