package com.arrays.programming;

public class ThreeDArray {

	public static void main(String[] args) {
		// 234
		int elements[][][] = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
				{ { 11, 12, 13, 14 }, { 15, 16, 17, 18 }, { 19, 20, 21, 22 } }

		};
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				for (int k = 0; k < elements[i][j].length; k++) {
					System.out.print(elements[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("using enchanced for loop");
		for (int x[][] : elements) {
			for (int y[] : x) {
				for (int z : y) {
					System.out.print(z + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}

}
