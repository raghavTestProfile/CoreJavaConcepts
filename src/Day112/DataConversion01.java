package Day112;

public class DataConversion01 {

	public static void main(String[] args) {
		// data conversion
		
		//String --> int,double,	boolean,char
		
		//String to integer ( alphabetic string cannot be converted,only numeric value can be converted)
		String s="12345";
		int sint=Integer.parseInt(s);
		sint=sint+10;
		System.out.println(sint);
		
		//String to double
		
		String s2="12345.1";
		double s2d=Double.parseDouble(s2);
		s2d=s2d+1.1;
		System.out.println(s2d);
		
		//String to Boolean
		String s3= "false";    //if we pass anything other than true then the it will consider it as false
		Boolean bs3=Boolean.parseBoolean(s3);
		System.out.println(bs3);
		
		//String to char is not possible as String is a collection of characters and multiple characters we cannot fit into single char variable
		
		
		

	}

}
