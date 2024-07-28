package Day6;

public class Encapsulation003 {

	public static void main(String[] args) {
		// main class to call Encapsulation002
		
		Encapsulation002 acc=new Encapsulation002();
		acc.setAcc_no(110);
		acc.setAmount(123.23);
		acc.setName("raghav");
		
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
		
		
		

	}

}
