package Day2;

public class Arrays1 {

	public static void main(String[] args) {


		// Arrays is collection of elements (Homogeneous data),  hetrogeneous data can be stores in ArrayLists
		
		int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=250;
		a[3]=300;
		a[4]=500;
		
		int b[]= {100,200,300,400,500};
		
		//length of an array
		
		System.out.println(a.length);
		System.out.println(a[4]);
		
		//enhanced for loop
		
		for(int x:a) {
			System.out.println(x);
		}
		
		

	}

}
