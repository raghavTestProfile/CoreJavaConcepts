package Day116;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsFramework001 {

	public static void main(String[] args) {
		// Arraylist

		// ArrayList al=new ArrayList();
		// List al=new ArrayList(); //same as above decalration. Hence Valid

		// ArrayList<Integer> al=new ArrayList<Integer> ();
		// ArrayList<String> al=new ArrayList<String> ();
		// ArrayList<employee> al=new ArrayList<employee> ();

		ArrayList al = new ArrayList();
		// adding data in arraylist
		al.add(100);
		al.add(100);
		al.add(10.5);
		al.add("Welcome");
		al.add(true);
		al.add('A');
		al.add(null);
		al.add(null);

		// size
		System.out.println(al.size());
		// print
		System.out.println(al);
		// remove
		al.remove(3);
		System.out.println(al);

		// insert( we can insert anywhere in the middle of the list)
		al.add(2, "Java");
		System.out.println(al);

		// modify element in arraylist
		al.set(2, "python");
		System.out.println(al);

		// printing spcific element
		System.out.println(al.get(3));

		// reading arraylist
		// for loop

//		for (int i = 0; i < al.size(); i++) {
//
//			al.get(i);
//
//		}

//		for (Object x : al) {
//
//			System.out.print(x+" , ");
//
//		}

		// using Iterator- only used for lists

		Iterator it = al.iterator(); // if array list considers only inegers than we can use like this -->
										// Iterator<String> it=al.iterator();

		while (it.hasNext()) {
			System.out.print("," + it.next()); // next method always return 1st value if not used inside the loop
			
		}
		System.out.println();

		System.out.println(al.isEmpty());
		
		//remove specific elements from the array
		
		ArrayList al2=new ArrayList();
		al2.add(true);
		al2.add(10.5);
		al.removeAll(al2);
		System.out.println(al);
		
		//clear removes all the elements
		al2.clear();
		System.out.println(al2.isEmpty());
		
		

	}

}
