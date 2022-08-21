package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetWithArrays {

	public static void main(String[] args) {

		String[] asianCtrs = { "india", "pakistan", "china" };
		String[] europeCtrs = { "germeny", "finland", "denmerk" };
		String[] aftricaCtrs = { "south africa", "west indies", "somalia" };
		String[] australiaCtrs = { "australia" };

		Set<String[]> continents = new HashSet<String[]>();
		continents.add(asianCtrs);
		continents.add(europeCtrs);
		continents.add(aftricaCtrs);
		continents.add(australiaCtrs);

		Iterator<String[]> itr = continents.iterator();
		while (itr.hasNext()) {
			String[] a = itr.next();
			for (String x : a) {
				System.out.println(x);
			}
			System.out.println();
		}

	}

}
