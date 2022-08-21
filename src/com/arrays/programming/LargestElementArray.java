package com.arrays.programming;

public class LargestElementArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 3, 0, 8, 7 };
		int largest = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}

		System.out.println(largest);
	}

}
