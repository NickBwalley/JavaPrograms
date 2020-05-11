package for_Loop;
import java.util.Scanner;
public class forLoop {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int start, stop;
		System.out.println("Enter Number to Start Printing:");
		start = nicky.nextInt();
		System.out.println("Enter Number to Stop Printing: ");
		stop = nicky.nextInt();
		
		for(int counter = start; counter <= stop; counter++) {
			System.out.println(counter);
		}
		
	}

}
