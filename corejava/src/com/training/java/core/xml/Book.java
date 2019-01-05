package com.training.java.core.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	@XmlElement
	private String title;
	
	@XmlElement
	private String author;
	
	public Book()
	{
		
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

}
