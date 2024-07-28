package Day5;

public class Polymorphism003 {

	public static void main(String[] args) {
		// calling the methods in Polymorphism002

		Polymorphism002 adder = new Polymorphism002();

		adder.sum();
		adder.sum(10, 100);
		adder.sum(121.1, 100);
		adder.sum(12, 100.11);
		adder.sum(1, 2, 3);

	}

}
