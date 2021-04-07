package leapYear;
import leapYear2.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//leapYear();
		Main2 leapYear = new Main2();
		leapYear.checkLeapYear();
	}
	
	public static void leapYear() {
		Scanner nicky = new Scanner(System.in);
		System.out.println("Enter A Year: ");
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
			else
				isLeap = true;
		}
		else isLeap = false;
		
		if(isLeap == true)
			System.out.println("Year Entered is A LEAP YEAR!");
		else
			System.out.println("Year Entered is NOT A LEAP YEAR! ");
	}

}
