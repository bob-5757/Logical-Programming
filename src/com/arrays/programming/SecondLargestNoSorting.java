package com.arrays.programming;

public class SecondLargestNoSorting {

	public static void main(String[] args) {

		int a[] = { 22, 5, 3, 0, 8, 72 };

		int fbig = Integer.MIN_VALUE;
		int sbig = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (fbig < a[i]) {
				sbig = fbig;
				fbig = a[i];

			} else if (sbig < a[i] && a[i] != fbig) {
				sbig = a[i];
			}

		}
		System.out.println(sbig);

	}

}
