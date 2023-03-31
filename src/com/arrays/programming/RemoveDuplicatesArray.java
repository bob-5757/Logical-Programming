package com.arrays.programming;

import java.util.Arrays;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 4, 4 };
		int j = 0;
		System.out.println(Arrays.toString(a));
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}
			//

		}
		temp[j] = a[a.length - 1];
		System.out.println(Arrays.toString(temp));
	}

}
