package com.stringmanipulation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfCharacterString {

	public static void main(String[] args) {

		String str = "aabbcc";
		str = str.replaceAll(" ", "");
		char thatchar = 0;
		int charCount = 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}

		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
