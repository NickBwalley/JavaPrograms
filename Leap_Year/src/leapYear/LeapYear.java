package leapYear;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int year;
		System.out.println("Enter A Year: ");
		year = nicky.nextInt();
		nicky.close();
		
		boolean isLeap = false;
		//adding nested if-Statements
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0)
					isLeap = true;
				else
					isLeap = false;
			}
			else isLeap = true;
		}
		else isLeap = false;
		
		if(isLeap == true)
			System.out.println("Year Entered is a Leap Year!..");
		else
			System.out.println("Year Entered is Not a Leap Year!..");
	}

}
