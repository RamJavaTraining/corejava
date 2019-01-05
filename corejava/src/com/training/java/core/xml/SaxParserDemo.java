package com.training.java.core.xml;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserDemo extends DefaultHandler {

	private String tempVariable;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new SaxParserDemo().parse();
	}

	private void parse() throws Exception {

		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();

		parser.parse("students.xml", this);
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		tempVariable = "";
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		if (qName.equals("firstName")) {
			System.out.println("First name from XML = " + tempVariable);
		} else if (qName.equals("lastName")) {
			System.out.println("Last name from XML = " + tempVariable);
		} else if (qName.equals("city")) {
			System.out.println("City from XML = " + tempVariable);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		tempVariable = new String(ch, start, length);
	}
}
