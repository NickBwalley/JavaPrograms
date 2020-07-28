package classsesAndObjects;

public class Main {
	
	
	public static void main(String[] args) {
		// 1. Through reference
		ByReference r = new ByReference();
		ByReference n = new ByReference();
		
		r.id = 122790;
		r.name = "Nicholas";
		n.id = 122994;
		n.name = "Lorna";
		
		System.out.println(r.id + " " + r.name);
		System.out.println(n.id + " " + n.name);
		System.out.println("-----------------------");
		ByMethod m1 = new ByMethod();
		ByMethod m2 = new ByMethod();
		m1.studentDetails(122790, "Nicholas");
		m2.studentDetails(122994, "Lorna");
		m1.displayInformation();
		m2.displayInformation();
		System.out.println("-----------------------");
		
	}
/*	DIFFERENT WAYS TO INITIALIZE OBJECTS
 * 1.By Reference Variable
 * 2.By Method
 * 3.By constructor
 *  
 * */
}
