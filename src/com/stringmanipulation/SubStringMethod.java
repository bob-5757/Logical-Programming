package com.stringmanipulation;

public class SubStringMethod {

	public static void main(String[] args) {

		String str = "0abcdefghijkl";
		System.out.println(str.charAt(6));
		System.out.println(str.substring(1, 6));
		System.out.println(str.startsWith("0"));
		System.out.println(str.lastIndexOf("l"));
		
		String[] s = str.split("");
		System.out.println(str.replaceAll("l", "zzzz"));
		System.out.println(str);
		
		String a = " ";
		
		System.out.println(a.isEmpty());
		System.out.println(a.isBlank());
	}

}
