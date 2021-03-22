package arraysPassing;

import java.util.Scanner;

// program to allow the user to input numbers in an array and the program displays the output incremented by one
public class Main2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// create an array with user input
		int[] myArray = new int[5];
		// loop through myArray
		for (int j = 0; j < myArray.length; j++) {
			System.out.println("Enter Element: ");
			myArray[j] = input.nextInt();
		}
		
		// invoke the addOne method to add element entered by the user by one then display the output
		addOne(myArray);
		
		// for each loop to print out the elements of the array
		for (int z : myArray) {
			System.out.println(z);
		}

	}
	
	// method to add each element entered by the user by one and display the values incremented by one
	public static void addOne(int [] x) {
		for (int i = 0; i < x.length; i++) {
			x[i]+=1;
		}
	}

}
