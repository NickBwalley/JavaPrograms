package tobinaryconversion;
import java.util.Scanner;
public class BinaryToDecimal {
	
	public void binaryToDecimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		String toBinary = input.nextLine();
		System.out.println("Decimal Equivalent: " + Integer.parseInt(toBinary,2));
		input.close();
	}
}
