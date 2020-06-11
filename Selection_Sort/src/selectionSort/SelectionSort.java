package selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] sampleArray = {991,766,430,240,849,661,323,424,541};
		
		int[] results = selectionSort(sampleArray);
		//creating an enhanced for loop to print out the values
		
		for(int z: results)
			System.out.printf("%s ", z);
		
	}
	
	//method to sort an array using SelectionSort
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			int minIndex = i;
			for(int j = i; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//swapping the smallest number with the number at index [i]
			int temp;
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
		}
		return arr;
	}

}
