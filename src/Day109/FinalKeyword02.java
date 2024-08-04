package Day109;

class Test1 {

	final void m() {
		System.out.println("this is M() from Test1 class");
	}
}

final class Test2 extends Test1 {

	void m() { // because m is a final method in Test 1 , hence we cannot override the methods
				// in child class

		System.out.println("this is M() from Test2 class");
	}
}

class Test3 extends Test2 { // final classes cannot be extended in child class

}

public class FinalKeyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
