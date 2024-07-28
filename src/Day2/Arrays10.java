package Day2;

import java.util.Arrays;

public class Arrays10 {

	public static void main(String[] args) {
		// sorting array with for loop

		int a[] = { 50, 20, 40, 10, 100 };


		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				int temp = 0;

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			

		}
		System.out.println(Arrays.toString(a));

	}

}
