package Day2;

public class Arrays2 {

	public static void main(String[] args) {
		// 2 dimensional arrays

		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		a[1][0] = 300;
		a[1][1] = 400;
		a[2][0] = 500;
		a[2][1] = 600;

		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println(b.length); // no of rows

		System.out.println(b[0].length); // will fetch no of columns

		System.out.println(a[2][1]);

		// display all the rows and columns

//		for (int i = 0; i < a.length-1; i++) {
//
//			for (int c = 0; c <= a[i].length-1; c++) {
//
//				System.out.println(a[i][c]);
//			}
//
//		}
		
		// using  for loop
		
		for(int arr[]:a) {
			
			for(int x :arr) {
				
				System.out.println(x);
			}
			
			
		}

	}

}
