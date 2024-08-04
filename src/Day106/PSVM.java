package Day106;

public class PSVM {

	public static void main(String[] args) {
		// Details about the main class
		
		//so when the execution starts the JVM searches the public static void main (String args[]) method and when it finds it, it starts execution
		
		//public static void main (String []args)-- valid 
		//static public void main(String []args) --valid
		//public void static main(String args[]) --Invalid  --- return type should always before main 
		//void main(String args[]) public static --Invalid-- after closing the () , there should not be any text
		//public static void main(int a[])--valid--JVM will not look for this method as it doesnot have String args[], but still it will be a valid method
		

	}

}
