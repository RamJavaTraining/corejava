package com.training.java.core.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class DOMParserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		new DOMParserDemo().parse();
	}

	private void parse() throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.parse("students.xml");
		
		//Get the root element
		Element rootElement = document.getDocumentElement();
		
		//This is how you get the node name
		String rootElementName = rootElement.getNodeName();
		System.out.println("Root element name = " + rootElementName);
		
		//Get the student nodes under students root node
		NodeList studentNodes = rootElement.getElementsByTagName("student");
		
		for(int i=0; i<studentNodes.getLength(); i++)
		{
			//Get the each student node
			Element studentElement = (Element) studentNodes.item(i);
			System.out.println("StudentElement name = " + studentElement.getNodeName());
			
			//Get the id attribute of student
			String id = studentElement.getAttribute("id");
			System.out.println("id = " + id);
			
			//Let us get the first name element
			Element firstName = (Element)studentElement.getElementsByTagName("firstName").item(0);
			String nodeName = firstName.getNodeName();
			String nodeValue = firstName.getTextContent();
			System.out.println("Node name =  " + nodeName + " -- Value = " + nodeValue);
			
			//Now, lastName element
			Element lastName = (Element)studentElement.getElementsByTagName("lastName").item(0);
			String lastNameNodeName = lastName.getNodeName();
			String lastNameNodeValue = lastName.getTextContent();
			System.out.println("Node name =  " + lastNameNodeName + " -- Value = " + lastNameNodeValue);
			
			//And, city element
			Element city = (Element)studentElement.getElementsByTagName("city").item(0);
			String cityNodeName = city.getNodeName();
			String cityNodeValue = city.getTextContent();
			System.out.println("Node name =  " + cityNodeName + " -- Value = " + cityNodeValue);
		}
	}

}
