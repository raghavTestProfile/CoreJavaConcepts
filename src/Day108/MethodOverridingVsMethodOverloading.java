package Day108;

class ABC {

	void m1(int a) {
		System.out.println(a);
	}

	void m2(int b) {
		System.out.println(b);
	}

}

class XYZ extends ABC {

	void m1(int a) {
		System.out.println(a * a); // the method name is same but the implementation is different hence its method
									// overriding
	}

	void m2(int a, int b) {

		System.out.println(a + b); // the method name is same but the parameters are different hence its method
									// overloading
	}
}

public class MethodOverridingVsMethodOverloading {

	public static void main(String[] args) {
		// method overloading vs over riding

		XYZ obj1 = new XYZ();
		obj1.m1(10);
		obj1.m2(20);
		obj1.m2(30, 40);

	}

}
