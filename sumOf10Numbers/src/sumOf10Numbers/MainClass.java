package sumOf10Numbers;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int counter = 0;
		int total = 0;
		int number;
		double average = 0;
		//creating a while loop
		while(counter < 10) {
			System.out.println("Enter Number:");
			number = nicky.nextInt();
			total+=number;
			counter ++;
		}
	
		average = total/10;
		System.out.println("Your Total is: "+ total);
		System.out.println("Your Average is: "+ average);
	}

}
