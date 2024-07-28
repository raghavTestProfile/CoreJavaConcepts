package Day4;

public class Student01 {

	int sid; // class variables
	String sname;
	char grad;

	void printStudentData() {

		System.out.println(sid + " " + sname + " " + grad);

	}

	void StudentsetData(int id, String name, char grade) {    //id will be called local variables

		sid = id;
		sname = name;
		grad = grade;

	}
	
	Student01(int id, String name, char grade){   //contructor- it wont return any value (not even void )and will execute first
		
		sid = id;
		sname = name;
		grad = grade;
	}

}
