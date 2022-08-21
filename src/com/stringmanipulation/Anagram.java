package com.stringmanipulation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String a = "Hate";
		String b = "    Heat ";

		char[] aa = a.trim().toUpperCase().toCharArray();
		char[] bb = b.trim().toUpperCase().toCharArray();

		Arrays.sort(aa);
		Arrays.sort(bb);
		if (Arrays.equals(aa, bb)) {
			System.out.println("Both are anagrams");
		} else {
			System.out.println("Both are not anagrams");
		}

	}

}
