package com.stringmanipulation;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str = "abcdcba";
		int i = 0, j = str.length() - 1;
		boolean isPalindrome = true;
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalindrome = false;
				System.out.println("not palindrome");
				break;
			}
			i++;
			j--;
		}
		if (isPalindrome == true) {
			System.out.println("its palindrome");
		}

	}

}
