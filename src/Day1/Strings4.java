package Day1;

public class Strings4 {

	public static void main(String[] args) {
		// The difference between == and equals

		String s1 = "Welcome";
		String s2 = "Welcome";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // there is no differnece between the two of the strings are initialized like
											// s1 and s2 are

		// Scenario 2

		String a1 = new String("Welcome");
		String a2 = new String("Welcome");

		System.out.println(a1 == a2); // == is used to compare the objects, hence its comparing the object a1 and a2 which are not equal as they are reffering to 
		//different objects
		System.out.println(a1.equals(a2)); // equals is used to compare the values of the objects

		// Scenario 3

		String b1 = "Welcome";
		String b2 = new String("Welcome");

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}

}
