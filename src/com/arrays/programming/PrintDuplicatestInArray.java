package com.arrays.programming;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatestInArray {

	public static void main(String[] args) {
		int a[] = { 3, 0, 8, 7, 5, 2 };
		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		boolean isDuplicate = false;
		for (int i = 0; i < a.length; i++) {

			if (uniqueNumbers.contains(a[i])) {
				isDuplicate = true;
				System.out.println("Duplicate element " + a[i]);
			} else {
				uniqueNumbers.add(a[i]);
			}
		}

		if (!isDuplicate) {
			System.out.println("No duplicates found");
		}

	}

}
