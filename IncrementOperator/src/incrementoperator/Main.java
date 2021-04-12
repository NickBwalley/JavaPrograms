package incrementoperator;

public class Main {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		
		a += 5; // The same as a = a + 5
		System.out.println(a);
		a*=5; // 45 * 5 = 225 
		System.out.println(a);
		System.out.println(b);
		System.out.println(b++); // increments first before printing 
		System.out.println(b);	// prints out the incremented value 
		System.out.println(++b); //increments the value and prints out the value 
		

	}

}
