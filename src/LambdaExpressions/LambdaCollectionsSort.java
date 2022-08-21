package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LambdaCollectionsSort {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "CC", 1000));
		list.add(new Product(2, "BB", 2000));
		list.add(new Product(3, "AA", 3000));
		for (Product p : list) {
			System.out.println(p.pid + " " + p.pname + " " + p.price);
		}

		Collections.sort(list, (p1, p2) -> {
			return p1.pname.compareTo(p2.pname);
		});

		System.out.println("");
		for (Product p : list) {
			System.out.println(p.pid + " " + p.pname + " " + p.price);
		}
	}

}
