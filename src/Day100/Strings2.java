package Day100;

public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reverse a string

		String s = "Welcome";

		// Approach 1

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		// Approach 2-- without using string methods

		String rev2 = "";

		char a[] = s.toCharArray();

		for (int i = a.length - 1; i >= 0; i--)
			rev2 = rev2 + a[i];

		System.out.println(rev2);

		// Approach 3-- using string buffer class

		StringBuffer sb = new StringBuffer("Welcome 3");
		System.out.println(sb.reverse());

		// Approach 4-- using string builder class

		StringBuilder sb2 = new StringBuilder("Welcome 4");
		System.out.println(sb2.reverse());

	}

}
