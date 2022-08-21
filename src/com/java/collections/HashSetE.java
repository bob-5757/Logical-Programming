package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetE {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("apple");
		hs.add("ball");
		hs.add("cat");
		hs.add("dog");

		for (String s : hs) {
			System.out.println(s);
		}

		System.out.println("using iterator");

		for (Iterator<String> itr = hs.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

	}
}
