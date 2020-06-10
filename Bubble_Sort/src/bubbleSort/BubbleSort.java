package bubbleSort;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		int [] sampleArray = {91,99,71,48,93,94,88,59,41,19,65};
		//array to print out the sorted array
		int [] sortedArray = bubbleSort(sampleArray);
		//using a for loop to print out the values inside the array 
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.printf("%s ", sortedArray[i]);
		}
		
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
	public static int[] bubbleSortAlgorithm() {
		Scanner nicky = new Scanner(System.in);
		System.out.println("Declare the Size of Your Array: ");
		int n; 
		n = nicky.nextInt();
		int[] nick = new int[n];
		System.out.println("Enter Your Numbers in Any Order: ");
		for(int i = 0; i < nick.length; i++) {
			int m;
			m = nicky.nextInt();
		}
		//printing out the elements inside your array unsorted 
		for(int w = 0; w < nick.length; w++) {
			System.out.printf("%s ", nick[w]);
		}
		//sorting the array using bubble sort;
		int sort = nick.length;
		for(int x = 0; x < sort; x++) {
			
		}
	}

}
