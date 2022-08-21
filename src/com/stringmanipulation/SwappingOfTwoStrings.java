package com.stringmanipulation;

public class SwappingOfTwoStrings {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		
		a = a+b;//
		b = a.substring(0, a.length()-b.length());//hello
		a = a.substring(b.length());
		System.out.println(a+"\n"+b);
	}

}
