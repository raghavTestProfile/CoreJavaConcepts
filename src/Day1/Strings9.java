package Day1;

public class Strings9 {

	public static void main(String[] args) {
		// count words in a string

		String str = "new String hello";

		int count = 1;

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == ' ') {

				count++;
			}

		}
		System.out.println(count);

	}

}
