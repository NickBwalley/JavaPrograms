package basicInputsOutputs;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = input.nextInt();
		System.out.println("Number is: " + num1 + " and " + num2);		
		
	}

}
