package Day109;

class Test {

	final int x = 100;  //   -- if final keyword is applied then we cannot change the value of the variable
	
}

public class FinalKeyword01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test ob = new Test();
		ob.x = 200;
		System.out.println(ob.x);

	}

}
