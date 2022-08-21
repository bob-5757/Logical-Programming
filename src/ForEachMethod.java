import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMethod {

	public static void main(String[] args) {

		List<Integer> nos = Arrays.asList(1, 2, 3, 4, 5);
		nos.forEach(i -> System.out.println(i));
		System.out.println("***");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("enhanced for loop");
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("using whileloop entryset");
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		System.out.println("using entryset");
		Set<Entry<Integer, String>> entry1 = hm.entrySet();
		Iterator<Entry<Integer, String>> itrr = entry1.iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entryy = itrr.next();
			System.out.println(entryy.getKey() + " " + entryy.getValue());
		}

	}
}
