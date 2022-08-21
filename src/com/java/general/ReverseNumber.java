package com.java.general;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 985468;
		int rev = 0;
		System.out.println(num);
		while (num > 0) {
			rev = rev * 10 + (num % 10); // 43
			num = num / 10;
		}
		System.out.println(rev);
		System.out.println("**using strings**");
		int x = 123456;
		System.out.println(String.valueOf('c'));
		String numstr = String.valueOf(x);
		System.out.println(numstr);
		String revstr = "";

		for (int i = numstr.length() - 1; i >= 0; i--) {
			revstr += numstr.charAt(i);
		}
		System.out.println(revstr);

	}

}
