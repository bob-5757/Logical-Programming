package com.stringmanipulation;

import java.util.HashMap;

public class FrequencyOfString {

	public static void main(String[] args) {

		String str = "apple ball apple ball cat dog elephant ball ball ball cat cat dog dog ";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String proc[] = str.split(" ");
		for (int i = 0; i < proc.length; i++) {
			if (hm.containsKey(proc[i])) {
				hm.put(proc[i], hm.get(proc[i]) + 1);
			}

			else {
				hm.put(proc[i], 1);
			}
		}

		System.out.println(hm);
	}

}
