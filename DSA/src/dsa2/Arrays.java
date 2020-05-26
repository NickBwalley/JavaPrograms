package dsa2;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		//largestNumber();
		//System.out.println(checkElement());
		System.out.println(sumElements());
	}
	
	//method to determine the largest number in an array
	public static void largestNumber() {
		Scanner nicky = new Scanner(System.in);
		int n, max;
		System.out.println("Enter the Size of Your Array: ");
		n = nicky.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the Elements of the Array: ");
		for(int x = 0; x < array.length; x++) {
			array[x] = nicky.nextInt();
		}
		max = array[0];
		for(int y = 0; y < array.length; y++) {
			if(max < array[y]) {
				max = array[y];
			}
		}
		System.out.println("The Largest Number is: "+max);
	}
	
	//method to check element existence inside an array
	public static boolean checkElement() {
		Scanner rikki = new Scanner(System.in);
		int n;
		int numbers[] = {29,39,49,59,69,79,87,88,41,99,42};
		System.out.println("Search for a Number: ");
		n = rikki.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if(n == numbers[i]) {
				return true;
			}
		}
		return false;
	}
	
	//method to add elements inside of an array:
	public static int sumElements() {
		Scanner nicky = new Scanner(System.in);
		int n;
		int total = 0;
		System.out.println("Enter Size of the Array");
		n = nicky.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Your Numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nicky.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
		}
		return total;
	}
	

}
