package recursion;
import java.util.Scanner;
public class Main {
	// Good example of illustration of recursion is use of factorial
	// N! = N * (N-1) * (N-2) * (N-3) * ..... * 2 * 1
	// 5! = 5 * 4 * 3 * 2 * 1
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to find Factorial: ");
		int number = input.nextInt();
		System.out.println("Factorial of " +  number +" is " + factorial(number));
	}
	// finding factorial of a number using recursion
	public static int factorial (int n) {
		if (n <= 1)
			return 1;
		else
			return (n * factorial(n-1));
		
	}
	

}
