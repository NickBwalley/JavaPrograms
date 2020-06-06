package binaryConversions;
import java.util.Scanner;
public class BinaryToDecimal {
	
	public void binaryToDecimal() {
		Scanner nicky = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		String binaryString = nicky.nextLine();
		System.out.println("Decimal Equivalent: " + Integer.parseInt(binaryString,2));
		
	}
}
