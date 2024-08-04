package Day104;

public class Polymorphism002 {

	int x=11, y=12;

	// polymorphism can be achieved through method overloading as shown below

	void sum() {
		System.out.println(x + y);
	}

	void sum(int a, int b) {
		System.out.println(a + b);

	}

	void sum(double a, int b) {
		System.out.println(a + b);

	}

	void sum(int b, double a) {
		System.out.println(a + b);

	}

	void sum(int a, int b, int c) {

		System.out.println(a + b + c);
	}

}
