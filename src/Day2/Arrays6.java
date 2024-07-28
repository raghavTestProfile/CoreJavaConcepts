package Day2;

public class Arrays6 {

	public static void main(String[] args) {
		// no of repetitions

		int a[] = { 100, 200, 300, 400, 500, 100, 200 };
		int num=100;
		int count=0;

		for (int value : a) {
			
			if(num==value) {
			
			count++;
			
			}

		}
		
		System.out.println(count);

	}

}
