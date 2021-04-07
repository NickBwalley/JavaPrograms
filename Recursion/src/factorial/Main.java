package factorial;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int n;
		System.out.println("Enter Your Number: ");
		n = nicky.nextInt();
		findFactorial(n);
		System.out.println("Factorial of "+n +" is "+findFactorial(n));
		nicky.close();
	}
	
	//method to calculate factorial using recursion
	public static long findFactorial(int num) {
		//recursion must have a base case
		if(num >= 1) {
			return num * findFactorial(num - 1);
		}else {
			return 1;
		}
	}

}
