package Day115;

class Parent {
	String name = "John";

	void m1() {

		System.out.println("m1 parent");

	}
}

class Child extends  Parent {

	int id = 10;

	void m2() {
		System.out.println("m2 child");
	}
}

public class TypeCasting02 {

	public static void main(String[] args) {
	//upcasting and downcasting for the objects
		
		/*Child c=new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		*/
		
//		Parent p=new Child();     //upcasting, storing the child object in the parent (we can also do for grand parent)
//		System.out.println(p.name);
//		p.m1();
//		System.out.println(p.id);  //these are not accessible as even though the object got created of the child,the reference variable is of parent
//		p.m2(); //these are not accessible
		
		Parent p=new Parent();
		Child c=(Child)p;       //down casting--> it will show java.lang.ClassCastException at run time as we are trying to save parent reference variable to child
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		

	}

}
