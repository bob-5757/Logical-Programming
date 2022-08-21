package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");

		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(1);
		all.add(2);
		all.add(3);
		all.add(4);
		all.add(5);

		Map<ArrayList<String>, ArrayList<Integer>> map = new HashMap<ArrayList<String>, ArrayList<Integer>>();
		map.put(al, all);

		Iterator<Entry<ArrayList<String>, ArrayList<Integer>>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<ArrayList<String>, ArrayList<Integer>> entry = itr.next();
			ArrayList<String> keys = entry.getKey();
			ArrayList<Integer> values = entry.getValue();
			System.out.println(keys + " " + values);

		}

	}

}
