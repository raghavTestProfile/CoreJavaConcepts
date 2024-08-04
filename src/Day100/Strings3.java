package Day100;

public class Strings3 {

	public static void main(String[] args) {
		
		//immutable- we cannot change--Strings
		
		String a="welcome";
		System.out.println(a);
		a.concat(" to java");
		System.out.println(a);    // hence we cannot change
		
		
		//mutable- we can change--StringBuffer
		
		StringBuffer sbf=new StringBuffer("Welcome");
		sbf.append("to java");              //append will work as concat for String buffer
		System.out.println(sbf);    //mutable, original value got changed
		
		
		//mutable- we can change--,StringBuilder
		
		StringBuilder sbd=new StringBuilder("Hello");
		sbd.append("Java");
		System.out.println(sbd);    //mutable, original value got changed
		
		
	

	}

}
