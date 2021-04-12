package foreachloop;
import java.util.Scanner;
public class Main {
	// There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
	/*
	 * Syntax
	for (type variableName : arrayName) {
	  // code block to be executed
	}*/
	public static void main(String[] args) {
		printArray();
	}
	
	
	//method to print out array elements using the for-each Loop
	public static void printArray() {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("Enter size of the Array: ");
		n = input.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter the Elements of the Array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		//printing Elements of the array(This is using an enhanced for loop in printing elements of the array)
		System.out.println("\nThe Elements of the Array are: ");
		for(int z: array) {
			System.out.println(z);
		}
		input.close();
	}

}
