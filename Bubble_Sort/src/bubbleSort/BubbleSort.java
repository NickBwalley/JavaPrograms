package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] sampleArray = {91,222,79,10,61,99,48,77,90};
		int [] sortedArray = bubbleSort(sampleArray);
		//creating a for loop to print the elements sorted in the bubble sort 
		for(int z = 0; z < sortedArray.length; z++) {
			System.out.printf("%s ", sortedArray[z]);
		}
		
	}
	
	//method to sort an array using Bubble Sort
	public static int [] bubbleSort(int [] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for(int j = 0; j < (n-1); j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
		}
		return arr;
	}

}
