package Day2;

public class Arrays5 {

	public static void main(String[] args) {
		// Search an element in array (linear search)

		int a[] = { 10, 20, 30, 40, 50, 60 };
		int search_element = 30;
		boolean status = false;

		for (int x : a) {

			if (x == search_element) {

				System.out.println("Element found  ");
				status = true;
				break;

			}

		}
		if (status == false) {
			System.out.println("Element not found ");
		}

	}

}
