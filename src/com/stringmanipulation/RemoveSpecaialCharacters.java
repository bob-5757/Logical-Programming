package com.stringmanipulation;

public class RemoveSpecaialCharacters {

	public static void main(String[] args) {
 
		String str = "@#$$amul *&((&%%%Bobbili";
		String output = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(output);
	}

}
