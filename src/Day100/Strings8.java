package Day100;

public class Strings8 {

	public static void main(String[] args) {
		// Count Occurrence of a character in a string
		

		String str = "Hello world";

		for (int i = 1; i <= str.length() ; i++) {

			char c = str.charAt(i);
			int count = 0;

			for (int j = 1; j <= str.length()-1; j++) {

				char d = str.charAt(j);
				if (d == c) {
					count++;
				}

			}
			System.out.println(" the count for " + c + " is  --> " + count);

		}

	}

}
