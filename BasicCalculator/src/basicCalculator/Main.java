package basicCalculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fnum;
		double snum;
		double answer; 
		System.out.println("Enter First Number: ");
		fnum = input.nextDouble();
		System.out.println("Enter Second Number: ");
		snum = input.nextDouble();
		answer = fnum + snum;
		System.out.println("Result : " + answer);
		input.close();
	}

}
