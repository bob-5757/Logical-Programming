package com.stringmanipulation;

public class NoOfUpperLowerCases {

	public static void main(String[] args) {
		String str = "aAbBcCd";
		int uCount = 0;
		int lCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				uCount += 1;
			}
			if (Character.isLowerCase(c)) {
				lCount += 1;
			}
		}
		System.out.println("Uppercase: " + uCount);
		System.out.println("Lowercase: " + lCount);

	}

}
