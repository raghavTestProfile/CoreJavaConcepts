package Day116;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CollectionsFramework003 {

	public static void main(String[] args) {
		// Hashmap
		// implemented Map interface
		// key is unique, but value can be duplicated

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// adding pairs
		hm.put(101, "John");
		hm.put(102, "Albert");
		hm.put(103, "Raghav");
		hm.put(104, "Rahul");
		hm.put(105, "Ali");

		System.out.println(hm);

		// size
		System.out.println(hm.size());
		// remove pair
		hm.remove(103);
		System.out.println(hm);

		// access value of a key
		System.out.println(hm.get(101));

		// return all the keys
		System.out.println(hm.keySet());
		// return all the values
		System.out.println(hm.values());
		// return both key and values
		System.out.println(hm.entrySet());

		// reading data from hashmap

		// using loop
//		for (int k : hm.keySet()) {
//
//			System.out.println(k+"    " +hm.get(k));
//
//		}

		// using iterator
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while(it.hasNext()) {
		//	System.out.println(it.next());
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
