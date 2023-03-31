package com.arrays.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArraysClass {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(Arrays.asList("apple", "ball", "cat", "dog"));
		int size = al.size();
		for (int i = 0; i < size; i++) {
			System.out.println(al.get(i));
		}
		System.out.println("***linked list***");
		LinkedList<String> ll = new LinkedList<String>(Arrays.asList("apple", "ball", "cat", "dog"));
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println(Arrays.asList(1,2,3,4,5));
	}

}
