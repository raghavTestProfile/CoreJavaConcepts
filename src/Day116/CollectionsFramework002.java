package Day116;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsFramework002 {

	public static void main(String[] args) {
		// hashset

		HashSet hs = new HashSet();
		// Set hs=new HashSet();
		// HashSet<String> hs=new HashSet<String>();
		
		//insertions order is not preserved and duplicate value not allowed in hashset and there is not indexing

		hs.add(100);
		hs.add(100);
		hs.add(10.5);
		hs.add("Welcome");
		hs.add(true);
		hs.add('A');
		hs.add(null);
		hs.add(null);

		System.out.println(hs);

		// remove
		hs.remove(true);
		System.out.println(hs);
		
		//size
		System.out.println(hs.size());
		
		// insertion is not possible in hashSet because elements are stored in random
		// order

		// access specific element, convert HashSet to ArrayList(direct retreval is not
		// possible)
		ArrayList al = new ArrayList(hs);
		System.out.println(al.get(2));

		// read all elements from hashset. Directly its not possible as hashset doesnt have index
//		for (Object x : hs) {
//			System.out.print(x+" ");
//		}
		
		//using Iterator
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		hs.clear();
		System.out.println(hs.isEmpty());
		

	}

}
