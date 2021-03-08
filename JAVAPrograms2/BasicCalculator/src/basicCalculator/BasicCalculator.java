package basicCalculator;
import java.util.Scanner;
public class BasicCalculator {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		double fnum;
		double snum;
		double answer; 
		System.out.println("Enter First Number: ");
		fnum = nicky.nextDouble();
		System.out.println("Enter Second Number: ");
		snum = nicky.nextDouble();
		answer = fnum + snum;
		System.out.println("Result : " + answer);
	}

}
