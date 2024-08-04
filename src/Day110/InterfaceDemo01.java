package Day110;

interface Shape {

	int length = 10; // the variable be static and final
	int widthx = 20;

	default void square() { // default methods are allowed in interface

		System.out.println("default method");

	}

	public void circle(); // abstract methods are allowed in interface ,they dont have any impementation

	static void rectangle() { // static methods are allowed in interface

		System.out.println("static method");

	}

}

public class InterfaceDemo01 implements Shape {
	
	@Override
	public void circle() {

		System.out.println("Abstract method");

	}
	
	int x=10;
	int y=20;


	public static void main(String[] args) {
		InterfaceDemo01 io=new InterfaceDemo01();
		io.circle();
		io.square();
		Shape.rectangle();
		
		Shape sh=new InterfaceDemo01();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
		System.out.println(Shape.length+Shape.widthx);
		
		System.out.println(sh.x+io.x);
		
		

	}

	
}
