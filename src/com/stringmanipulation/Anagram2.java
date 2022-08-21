package com.stringmanipulation;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {

		String a = "Hate";
		String b = "heat  ";

		char ar[] = a.trim().toLowerCase().toCharArray();
		char br[] = b.trim().toLowerCase().toCharArray();

		if (Arrays.equals(ar, br)) {
			System.out.println("Both are anagrams");

		} else {
			System.out.println("Both are not anagrams");
		}
		
	}

}
