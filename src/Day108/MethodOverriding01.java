package Day108;

class Bank {

	double roi() {
		return 0;
	}

}

class ICICI extends Bank {

	double roi() {
		return 10.5;
	}

}

class SBI extends Bank {

	double roi() {
		return 11.5;
	}

}

public class MethodOverriding01 {

	public static void main(String[] args) {
		// method overriding

		ICICI ic = new ICICI();
		System.out.println(ic.roi());

		SBI sb = new SBI();
		System.out.println(sb.roi());

	}

}
