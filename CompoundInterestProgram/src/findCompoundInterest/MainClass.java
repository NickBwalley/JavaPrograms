package findCompoundInterest;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double amount;
		double principal;
		double rate;
		System.out.println("Enter principal Amount: ");
		principal = input.nextDouble();
		System.out.println("Enter the Rate: ");
		rate = input.nextDouble();
		
		for(int day = 1; day < 31; day++) {
			amount = principal * Math.pow(1+rate, day);
			System.out.println(day + " " + amount);
		}
		
		input.close();
		
	}

}
