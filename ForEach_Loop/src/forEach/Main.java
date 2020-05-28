package forEach;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		printArray();
	}
	
	//method to print out array elements using the foreach Loop
	public static void printArray() {
		Scanner nicky = new Scanner(System.in);
		int n;
		System.out.println("Enter size of the Array: ");
		n = nicky.nextInt();
		int array[] = new int[n];
		
		System.out.println("Enter the Elements of the Array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = nicky.nextInt();
		}
		
		//printing Elements of the array(This is using an enhanced for loop in printing elements of the array)
		System.out.println("The Elements of the Array are: ");
		for(int z: array) {
			System.out.println(z);
		}
	}

}
