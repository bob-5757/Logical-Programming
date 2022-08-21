package com.stringmanipulation;

import java.util.HashMap;

public class FrequencyOfCharacterString {

	public static void main(String[] args) {

		String str = "aabbcc  dd ee nn ff";
		// a a

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}

		}

		System.out.println(hm);

	}

}
