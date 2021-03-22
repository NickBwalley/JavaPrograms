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
		
		System.out.println();
		
		System.out.println("Enter Number to find Sum from: ");
		int n = input.nextInt();
		
		int result = rangeOfSum(n);
		System.out.println(result);
		
		input.close();
		
	}
	// finding factorial of a number using recursion
	public static int factorial (int n) {
		if (n <= 1)
			return 1;
		else
			return (n * factorial(n-1));
		
	}
	
	// find sum of a range of numbers from 0
	public static int rangeOfSum(int x) {
		if (x > 0)
			return x + rangeOfSum(x-1);
		else
			return 0;
	}
	

}

/*
 * Halting Condition
Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of 
infinite recursion. Infinite recursion is when the function never stops calling itself. 
Every recursive function should have a halting condition, which is the condition where the 
function stops calling itself. In the previous example, the halting condition is when the parameter x becomes 0.*/
