package Day100;

public class Strings5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// palindrome
	

		String a = "RADAR";

		String temp = "";
		
		for(int i=a.length()-1;i>=0;i--)
			temp=temp+a.charAt(i);
		
		if(temp.equals(a))
			System.out.println("String is a palindrome");
		else
			System.out.println("String is not a palindrome");
			

	}

}
