package com.java.logicalprogramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TraverseHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");

		Iterator<Entry<Integer, String>> entry = hm.entrySet().iterator();
		while (entry.hasNext()) {
			Entry<Integer, String> e = entry.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		//using keyset
	Set<Integer>	ks = hm.keySet();
	for(Integer k:ks)
	{
		System.out.println(hm.get(k));
	}
	}
}
