package Day114;

public class ExceptionHandling04 {

	public static void main(String[] args) throws InterruptedException {
		// handling checked exceptions
		//they can be handled by two ways- try and Catch / Throws
		
		System.out.println("program is started....");
		
		try {
			Thread.sleep(2000);               //this will make the thread execution pause for 2 seconds
		}
		catch(InterruptedException e) {
			
		}
		
		Thread.sleep(0);

	}

}
