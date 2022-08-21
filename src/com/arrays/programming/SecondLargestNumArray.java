package com.arrays.programming;

public class SecondLargestNumArray {

	public static void main(String[] args) {

		int a[] = { 3, 2, 5, 0, 8, 7 };
		// 3 2 1
		for (int y : a) {
			System.out.print(y + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}
			}

		}
		for (int y : a) {
			System.out.print(y + " ");
		}
		System.out.println();
		System.out.println(a[a.length - 2]);

	}

}
