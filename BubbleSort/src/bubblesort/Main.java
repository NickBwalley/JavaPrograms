package bubblesort;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// unordered array 
		int [] sampleArray = {10,50,20,90,5,15,19,18,17,16};
		//array to print out the sorted array
		int [] sortedArray = bubbleSort(sampleArray);
		//using a for loop to print out the values inside the array 
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.printf("%s ", sortedArray[i]);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		bubbleSortAlgorithm();
	}
	
	//method to sort an Array using Bubble Sort
	public static int[] bubbleSort(int [] arr) {
		int n = arr.length;
		for(int a = 0; a < n; a++) {
			for(int x = 0 ; x < (n-1); x++) {
				if(arr[x] > arr[x+1]) {
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		return arr;
	}
	
	//method to prompt user enter an array then sorts it using bubble sort
	public static void bubbleSortAlgorithm() {
		Scanner nicky = new Scanner(System.in);
		System.out.println("Declare the Size of Your Array: ");
		int n; 
		n = nicky.nextInt();
		int[] nick = new int[n];
		System.out.println("Enter Your Numbers in Any Order: ");
		for(int i = 0; i < nick.length; i++) {
			nick[i] = nicky.nextInt();
		}

		//sorting the array using bubble sort;
		int sort = nick.length;
		for(int x = 0; x < sort; x++) {
			for(int y = 0; y < (sort - 1); y++) {
				if(nick[y] > nick[y+1]) {
					int temp = nick[y];
					nick[y] = nick[y+1];
					nick[y+1] = temp;
				}
				
			}
		}
		//printing the elements after being sorted in ascending order
		System.out.println();
		System.out.println("Elements in sorted order are: \n");
		for(int z = 0; z < sort; z++) {
			System.out.println(nick[z]);
		}
		
	}

}
