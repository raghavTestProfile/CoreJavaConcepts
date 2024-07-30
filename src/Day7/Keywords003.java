package Day7;

public class Keywords003 {

	static int a = 10;
	int b = 20;

	static void m1() {

		System.out.println("This is a static method");
	}

	void m2() {
		System.out.println("This is a non static method");
	}

	void m() {

		// non static method can access everything directly
		// objects cannot be created in the non static methods

		m1();
		m2();
	}

	public static void main(String[] args) {
		// static keyword
		// Static methods can directly access static variables and methods (without
		// creating object when the methods are in the same class)

		System.out.println(a);
		m1();
		// m2(); -- cannot access this directly as its non static

		// static methods can only acces non static through objects

		Keywords003 kw = new Keywords003();
		kw.m2();
		kw.m();
		
		// if we want to acces the static variables of some other class we can use it like-
		
		System.out.println(Keywords002.a);
		Keywords002.p1();

	}

}
