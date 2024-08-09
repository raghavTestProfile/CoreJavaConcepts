package Day115;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}



public class TypeCasting03 {
	

	

	public static void main(String[] args) {
	
		//Rule 1: for conversion to be valid the type of objects should have  some relationship(eg- child, parent)
		
		Animal an=new Dog();
		
		//Rule 2: for down casting the the object down casted should be either same or child of the object 
		
		
		Animal an1=new Dog();
		Cat ct=(Cat)an1;   //invalid as Dog has no relationship with Cat
		


	}

}
