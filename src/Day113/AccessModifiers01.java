package Day113;

public class AccessModifiers01 {

	public static void main(String[] args) {
		/*
		 * Private- These can only be accessed with the same class 
		 * Default -(if no access modifier is declared then its default) - these can accessed within the
		 * package 
		 * Protected- same as Private and default , but can also be accessed
		 * outside the package through inheritance
		 *  Public- Same has Protected, we can
		 * access outside the package without inheritance
		 */

		AccessModifiers02 obj1 = new AccessModifiers02();
		System.out.println(obj1.x);
		obj1.m1();

	}

}
