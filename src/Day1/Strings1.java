package Day1;

import java.util.Arrays;

public class Strings1 {

	public static void main(String[] args) {

		// Pre defined Strings methods

		String s1 = "Welcome";
		String s2 = new String("welcome");

		String s3 = "Welcome back to java";

		System.out.println(s3.length()); // int is the return type for .length
		System.out.println("Raghav".length());

		// concat() --join 2 strings

		String a1 = "Raghav";
		String a2 = "Bharadwaj";
		String a3 = "Automation";

		System.out.println(a1 + a2);
		System.out.println(a1.concat(a2));

		System.out.println(a1 + a2 + a3);
		System.out.println(a1.concat(a2).concat(a3));
		System.out.println("Welcome " + "To" + " Java");

		// trim -- remove space right and left side of the string

		String b1 = "  banglore   ";
		System.out.println(b1.length()); // print length along with spaces
		System.out.println(b1.trim().length());

		// charAt()- returns the character based on the index

		System.out.println(b1.charAt(2));

		// contains-- check value is present or not(case sensitive) ,, postions is not
		// imp but sequence should match

		String b2 = "Contains Testing";

		System.out.println(b2.contains(" "));
		System.out.println(b2.contains("Contains"));
		System.out.println(b2.contains("Testing"));
		System.out.println(b2.contains("Test"));

		// equals, equalsIgnoreCase

		String c1 = "Equals Testing";
		String c2 = "Equals TEsting";

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equalsIgnoreCase(c2));

		// replace()- it will replace single or mulitple sequence of characters in a
		// string

		String d1 = "Welcome to Selenium java selenium python selenium";
		System.out.println(d1.replaceAll("e", "A"));
		System.out.println(d1.replaceAll("Selenium", "Cypress"));

		// substring(), extracts substring from the mail string

		System.out.println(d1.substring(0, 3));
		System.out.println(d1.substring(1, 4));

		// upper and lower case
		System.out.println(d1.toUpperCase());
		System.out.println(d1.toLowerCase());

		// split() - split the string into multiple parts based on delimeter. It returns an Array of elements

		String e1 = "raghav@gmail.com";
		String a[] = e1.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
		System.out.println(a[0]);
		
		String e2 = "$15,44,67,33";
		System.out.println(e2.replace("$", "").replace(",", ""));
		
		
		String e3 = "abc,123@xyz";
		String arr1[]=e3.split(",");
		
		String arr2[]=arr1[1].split("@");
		
		

	}

}
