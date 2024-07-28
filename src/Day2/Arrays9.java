package Day2;

import java.util.Arrays;

public class Arrays9 {

	public static void main(String[] args) {
		// reverse an array

		int a[] = { 10, 20, 30, 40, 50, 60 };
		int b[] = new int[6];
		int count = 0;

		for (int i = a.length - 1; i >= 0; i--) {

			b[count] = a[i];
			count++;

		}
		
		System.out.println(Arrays.toString(b));

	}

}
