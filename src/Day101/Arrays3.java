package Day101;

public class Arrays3 {

	public static void main(String[] args) {

		// find sum of elements of an array
	

		int[] a = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			
			sum=sum+a[i];

		}
		
		System.out.println(sum);
	}

}
