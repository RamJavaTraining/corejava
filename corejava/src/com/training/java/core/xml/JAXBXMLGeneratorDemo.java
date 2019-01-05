package com.training.java.core.xml;

import javax.xml.bind.JAXB;


public class JAXBXMLGeneratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Book springInAction = new Book("Spring in Action", "Craig Walls");
		
		JAXB.marshal(springInAction, "C:\\book.xml");		
	}

}
