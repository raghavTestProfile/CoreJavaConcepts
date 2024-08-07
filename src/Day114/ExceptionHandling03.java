package Day114;

public class ExceptionHandling03 {

	public static void main(String[] args) {
		// Handling the exception

		try {
			String s = "welcome";
			int no = Integer.parseInt(s);
			System.out.println(no);
		} catch (Exception e) {    //e is a object reference variable, Exception Is a super class for all the Exceptions

			System.out.println(e);
			System.out.println("only enter numbers in the string");

		}
		
		finally {          //optional, the statements in this block always execute if exception is triggered or not or even if catch block is handled. Finally block always comes at the end of the catch block
			
			System.out.println("printing finally block");
		}

			
	}

}
