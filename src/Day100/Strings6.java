package Day100;

public class Strings6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Remove junk or special characters in a string
	

		String str = "This#string%contains^special*characters&.";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str);

	}

}
