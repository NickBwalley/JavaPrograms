package sumelementsinanarray;

import java.util.Scanner;

public class ArraySum {
	
	int [] nicky = new int[5];
	static int total = 0;
	int number; 
	
	//method to get user input
	public void getUserValues() {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < nicky.length; i++) {
			System.out.println("Enter " + i + " Number: ");
			nicky[i] = input.nextInt();
		}
		
		//for loop to sum the numbers of the array
		for(int i = 0; i < nicky.length; i++) {
			total+=nicky[i];
		}
	}
	
	// method return total value
	public static int getTotal() {
		return total;
	}
	
	// method print out the total value of the array
	public static void printValues() {
		System.out.printf("Total of Numbers: %d", getTotal());
	}

}
