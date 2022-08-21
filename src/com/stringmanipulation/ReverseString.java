package com.stringmanipulation;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {

		String str = "World";
		String rev = "";
		System.out.println(str);
		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i);
		}
		System.out.println(rev);
	}

}
