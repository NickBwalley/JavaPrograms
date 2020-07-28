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
	}
/*	DIFFERENT WAYS TO INITIALIZE OBJECTS
 * 1.By Reference Variable
 * 2.By Method
 * 3.By constructor
 *  
 * */
}
