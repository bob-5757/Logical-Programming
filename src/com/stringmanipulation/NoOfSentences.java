package com.stringmanipulation;

public class NoOfSentences {

	public static void main(String[] args) {
		String str = " THis is Amul Bobbili i am amul";
		int s = str.trim().split(" ").length;
		System.out.println("no of words in the string is: "+s);

	}

}
