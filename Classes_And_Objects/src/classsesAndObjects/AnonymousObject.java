package classsesAndObjects;

public class AnonymousObject {
	
	public void factorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + n + " is: " + factorial);
		
	}
}
