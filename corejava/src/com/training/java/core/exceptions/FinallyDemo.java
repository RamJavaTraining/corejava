package com.training.java.core.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FinallyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			FileWriter writer = new FileWriter("C:\\test.txt");
			out = new PrintWriter(writer);

			out.write("Hello \r");
			out.write(" How are you doing \r");
			out.write(" I am writing to a file for the first time..yahoo!!!");

			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

}
