package Day7;

public class Keywords001 {

	int x, y; // class / instance variables

	Keywords001(int x, int y) { // a and b are called local variables

		this.x = x;   //this represents class
		this.y =y;

	}

	void display() {

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		// this keyword

		Keywords001 key = new Keywords001(10, 20);
		key.display();

	}

}
