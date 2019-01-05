package com.training.java.core.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CheckedExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CheckedExceptionExample ce = new CheckedExceptionExample();
		ce.printStatesToFile();
	}
	
	private List<String> getStates()
	{
		List<String> states = new ArrayList<String>();
		
		states.add("MI");
		states.add("OH");
		
		return states;
	}
	
	private void printStatesToFile()
	{
		List<String> states = getStates();
		
		try {
			PrintWriter out = new PrintWriter(
			      new FileWriter("C:\\states.txt"));
			
	  	    for (int i = 0; i < states.size(); i++) {
		  	      out.println("State " + i + " = " + states.get(i));
		  	    }
		  	    out.close();
		} catch (IOException e) {
			//You are forced to catch the Exception here, since it is a checked Exception.
			e.printStackTrace();
		}

	}
}
