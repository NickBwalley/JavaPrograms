package leapYear2;
import java.util.Scanner;
public class LeapYearChecker {
	
	public void checkLeapYear() {
		Scanner nicky = new Scanner(System.in);		
		System.out.println("Enter A Year To Check: ");
		int year;
		year = nicky.nextInt();
		nicky.close();
		
		boolean isLeap = false;
		
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
			System.out.println("This is a LEAP YEAR!");
		else
			System.out.println("This is NOT A LEAP YEAR!");
		
	}
}
