package com.arrays.programming;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int a[] = { 4, 2, 3, 1 };
		System.out.println(Arrays.toString(a));
		int[] sortedArray = insertionSort(a);
		System.out.println(Arrays.toString(sortedArray));

	}

	private static int[] insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;

			while (j >= 0 && temp < a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;

		}
		return a;
	}

}
