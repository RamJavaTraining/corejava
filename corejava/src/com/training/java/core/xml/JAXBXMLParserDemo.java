package com.training.java.core.xml;

import javax.xml.bind.JAXB;

public class JAXBXMLParserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book book = JAXB.unmarshal("C:\\book.xml", Book.class);
		
		System.out.println("Title = " + book.getTitle());
		System.out.println("Author = " + book.getAuthor());
	}

}
