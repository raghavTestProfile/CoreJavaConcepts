package Day3;

public class Class002 {

	int eid;
	String ename;
	String job;
	int sal;

	void display() {

		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Class002 cl1=new Class002();
		cl1.eid=1001;
		cl1.ename="Raghav";
		cl1.job="Tester";
		cl1.sal=50000;
		cl1.display();

	}

}
