package com.arrays.programming;

public class TwoDArrayPrinting {

	public static void main(String[] args) {
		
	String[][] s =	show();
	for(String x[]:s)
	{
		System.out.println(x);
	}
	}
	
	public static String[][] show()
	{
		String[][] data = { { "AA", "" },

				{ "BB", "" },

				{ "CC", "" } };
		return data;
	}


}

