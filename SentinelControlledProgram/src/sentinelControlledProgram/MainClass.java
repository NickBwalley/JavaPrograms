package sentinelControlledProgram;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner nicky  = new Scanner(System.in);
		int number = 0;
		int total = 0;
		
		while(number != -1) {
			System.out.println("Enter Number: ");
			number = nicky.nextInt();
			total+= number;
		}
		
		System.out.println("The Result is: " + total);
		
	}

}
