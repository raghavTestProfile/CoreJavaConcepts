package Day115;

public class TypeCasting04 {

	public static void main(String[] args) {
	
		//Ex1
		Object o=new String("Welcome");
		StringBuffer sb=(StringBuffer)o;
		
		//Ex2
		String s=new String("hello");
		StringBuffer sb=(StringBuffer)s;          //there is no relation between string and string buffer hence invalid
		
		Object o1=new String("Welcome");
		StringBuffer sb1=(StringBuffer)o1;        //string and string buffer doesnt have anything in common so it will throw runtim ex
		
		//Ex2
		Object o2=new String("Welcome");
		StringBuffer sb2=(String)o2;
		
		
		

	}

}
