package Day112;

public class DataConversion02 {

	public static void main(String[] args) {
		// int,double, boolean,char -->String
		//any other type of conversion is not possible beside present in both the java classes

		int a = 10;
		String intS = String.valueOf(a);
		System.out.println(intS);

		double d = 10.5;
		String doubleS = String.valueOf(d);
		System.out.println(doubleS);
		
		char c='A';
		String charS=String.valueOf(c);
		System.out.println(charS);
		
		boolean b=true;
		String booleanS=String.valueOf(b);
		System.out.println(booleanS);

	}

}
