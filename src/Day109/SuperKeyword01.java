package Day109;

public class SuperKeyword01 {

	String color = "white";

	void eat() {

		System.out.println("eating parent class method");
	}
}

class Extends extends SuperKeyword01 {

	String color = "black";

	void displayColor() {

		System.out.println(color);

	}

	void displayColor2() {

		System.out.println(super.color); // when super is used it will call value from the parent class

	}

	void eat() {

		// System.out.println("eating child class method");
		super.eat();
	}

}
