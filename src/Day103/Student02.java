package Day103;

public class Student02 {

	public static void main(String[] args) {
	
		Student01 s1=new Student01(110,"raghav", 'A');    //at the time of object creation, contructor will be invoked
		
		//object using reference variables
//		s1.sid=110;
//		s1.sname="raghav";
//		s1.grad='A';
		
		
		//using methods
//		s1.StudentsetData(110,"raghav", 'A');
		s1.printStudentData();
		
		//using constructors

	}

}
