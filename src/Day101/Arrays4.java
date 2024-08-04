package Day101;

public class Arrays4 {

	public static void main(String[] args) {
		// print even and odd no of an array

		int a[] = { 10, 20, 30, 40, 55 };
		int even[] = new int[5];
		int odd[] = new int[5];

		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				even[count1] = a[i];
				count1++;

			} else {
				odd[count2] = a[i];
				count2++;

			}

		}

		System.out.print("Even numbers : ");

		for (int x : even) {

			System.out.print(x + ",");
		}

		System.out.println();

		System.out.print("Odd numbers : ");

		for (int x : odd) {

			System.out.print(x + ",");
		}

	}

}
