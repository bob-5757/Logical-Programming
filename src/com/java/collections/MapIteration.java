package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {

		Map<String, String> ctrys = new HashMap<String, String>();
		ctrys.put("india", "new delhi");
		ctrys.put("usa", "washington dc");
		ctrys.put("canada", "ottowa");
		ctrys.put("australia", "canberra");

		Iterator<String> keys = ctrys.keySet().iterator();
		while (keys.hasNext()) {
			System.out.println(ctrys.get(keys.next()));
		}

		/*
		 * System.out.println("using entryset"); Iterator<Entry<String, String>> itr =
		 * ctrys.entrySet().iterator(); for (; itr.hasNext();) { Entry<String, String>
		 * entry = itr.next(); System.out.println(entry.getKey() + "" +
		 * entry.getValue()); }
		 * 
		 * System.out.println("----");
		 * 
		 * for (Iterator<Entry<String, String>> itr1 = ctrys.entrySet().iterator();
		 * itr1.hasNext();) { Entry<String, String> entry1 = itr1.next();
		 * System.out.println(entry1.getKey() + "" + entry1.getValue()); }
		 */
		

		System.out.println("***********");
		for (Map.Entry<String, String> entry : ctrys.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
