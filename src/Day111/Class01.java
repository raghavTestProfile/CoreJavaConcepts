package Day111;

public class Class01 extends Class02 implements Interface01, Interface02 {            //only on class cacn be extended while n np of interfaces can be implemented

	public void m1() {

		System.out.println(x);

	}

	public void m2() {

		System.out.println(y);

	}

	public static void main(String[] args) {
		// Multiple inheritance demo

		Class01 cobj = new Class01();
		cobj.m1();
		cobj.m2();
		cobj.m3();

	}

}
