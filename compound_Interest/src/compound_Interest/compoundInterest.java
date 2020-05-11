package compound_Interest;
import java.util.Scanner;
public class compoundInterest {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		double amount;
		double principal;
		double rate;
		System.out.println("Enter principal Amount: ");
		principal = nicky.nextDouble();
		System.out.println("Enter the Rate: ");
		rate = nicky.nextDouble();
		
		for(int day = 1; day < 31; day++) {
			amount = principal * Math.pow(1+rate, day);
			System.out.println(day + " " + amount);
		}
		
	}

}
