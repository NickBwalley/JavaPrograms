package finallyBlock;
// The finally block always execute when the try block exists
// This ensures that the finally block executes even if an unexpected  exception occurs.
	
public class Main {
	
	public static int retInt() {
		int a = 100;
		try {
			a /= 0;
			return a;
		}catch (ArithmeticException e) {
			System.out.println("Catch Called!");
			System.out.println(e);
			return a;
		}finally { 	// called even if you are returning in the try block or in the catch block
			//a = 5000;
			System.out.println("Finally Called!");
			//return a; // overrides the results of a
		}
	}

	public static void main(String[] args) {
		System.out.println(retInt());

	}

}
