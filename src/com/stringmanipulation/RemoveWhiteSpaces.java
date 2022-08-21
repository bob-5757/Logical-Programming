package com.stringmanipulation;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "   Benedict CumberBatch   ";
		String output = str.replaceAll(" ", "");
		System.out.println(output);
		
		System.out.println("using trim()==>"+str.trim());
		
	}

}
