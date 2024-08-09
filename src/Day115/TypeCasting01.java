package Day115;

public class TypeCasting01 {

	public static void main(String[] args) {
		//Upcasting (Automatic)- Converting value from smaller --> larger
		//int -->long
		
		//down casting- Converting value from larger --> smaller
		//double --> float
		
		int intValue=100;
		long longValue=intValue;
		System.out.println(longValue);
		
		float floatValue=10.5F;
		double doubleValue=floatValue;
		System.out.println(doubleValue);
		
		
		long longValue2=1000;
		int intValue2=(int)longValue2;
		System.out.println(intValue2);
		
		double doubleValue2=125.44;
		int intValue3=(int)doubleValue2;
		System.out.println(intValue3);
		
		

	}

}
