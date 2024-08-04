package Day104;

public class Polymorphism004 {

	// constructor overloading

	double height, width, depth;

	Polymorphism004() {

		height = width = depth = 0;

	}

	Polymorphism004(double w, double h, double d) {

		height = h;
		depth = d;
		width = w;

	}
	
	Polymorphism004(double len){
		
		height = width = depth = len;
	}
	
	double volume() {
		
		return (width*height*depth);
	}
	
	

}
