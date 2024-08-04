package Day107;

class A {

	int a ;

	void display() {

		System.out.println(a);

	}
}

class B extends A {

	int b ;

	void show() {

		System.out.println(b);
	}
}

class C extends B {

	int c ;

	void print() {
		System.out.println(c);
	}
}

public class InheritanceA01 {

	public static void main(String[] args) {
		// Single Inheritance and Multi-level Inheritance

//		B obj = new B();
//		System.out.println(obj.a);
//		obj.display();
//		obj.show();
		
		C obj = new C();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		
		obj.display();
		obj.show();
		obj.print();
		
		

	}

}
