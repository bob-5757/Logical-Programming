package com.java.logicalprogramming;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {

		int a = 10, b = 5;
		System.out.println(a + "==>" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		// System.out.println(a + "==>" + b);

		a = (a + b) - (a = b);
		System.out.println(a + "==>" + b);

	}

}
