package Day2;

import java.util.Arrays;

public class Arrays8 {

	public static void main(String[] args) {
		// sorting char /String  array
		
		char s[]= {'D','A','C','E'};
		
		System.out.println("Before sorting"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting"+Arrays.toString(s));
		
		
		String s1[]= {"Dad","And","Cat","Eat"};
		System.out.println("Before sorting"+Arrays.toString(s1));
		Arrays.sort(s1);
		System.out.println("After sorting"+Arrays.toString(s1));

	}

}
