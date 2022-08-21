package com.arrays.programming;

public class Sorting {

	public static void main(String[] args) {

		int x[] = { 2, 5, 3, 0, 8, 7 };
		for (int y : x) {
			System.out.print(y + " ");
		}
		System.out.println(); // 4 3 2 1
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}
		}
		for (int y : x) {
			System.out.print(y + " ");
		}
	}

}
