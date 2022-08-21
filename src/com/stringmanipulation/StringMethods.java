package com.stringmanipulation;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Hello world";
		
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(1));
		System.out.println((int)'a'+"-->"+(int)'z');
		System.out.println((int)'A'+"-->"+(int)'Z');
		System.out.println((char)97);

		//System.out.println(str.compareTo("a"));
		
	}

}
