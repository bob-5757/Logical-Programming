package com.java.general;

import java.util.Iterator;

public class ContinueKeyWord {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (j == 2) {
					continue;
				}

				System.out.println("i==" + i + "j==" + j);

			}

		}

	}

}
