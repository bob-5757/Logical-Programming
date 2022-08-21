package com.stringmanipulation;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		// a11b22c33
		String str = "12b12c12";
		int sum = 0;
		String strnum = "";

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (Character.isDigit(c))
			{
				strnum = strnum + c;

			}

			else if (!strnum.equals(""))
			{

				sum += Integer.parseInt(strnum);
				strnum = "";

			}
			if (i == str.length() - 1) 
			{
				sum += Integer.parseInt(strnum);
			}

		}
		System.out.println(sum);
	}

}
