package forLoop;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// When you know exactly how many times you want to loop 
			//through a block of code, use the for loop instead of a while loop:
		int start, stop;
		System.out.println("Enter Number to Start Printing:");
		start = input.nextInt();
		System.out.println("Enter Number to Stop Printing: ");
		stop = input.nextInt();
		
		for(int counter = start; counter <= stop; counter++) {
			System.out.println(counter);
		}
		
		printEvenNumbers();
		
		
		input.close();
		
		
	}
	
	// method print even numbers in a range of values
	public static void printEvenNumbers() {
		Scanner input = new Scanner(System.in);
		int i = 0, j;
		
		System.out.println("Enter Last Number: ");
		j = input.nextInt();
		
		for (int counter = i; counter <= j; counter+=2) {
			System.out.println(counter);
		}
		input.close();
	}

}

/*
 * Syntax
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
Statement 1 is executed (one time) before the execution of the code block.

Statement 2 defines the condition for executing the code block.

Statement 3 is executed (every time) after the code block has been executed.

*/
