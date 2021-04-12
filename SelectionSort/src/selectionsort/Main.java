package selectionsort;

public class Main {

	public static void main(String[] args) {
		
		int[] sampleArray = {991,466,887,523,430,221,323,640,590,499};
		System.out.println("Array before sorting is; ");
		for(int y: sampleArray)
			System.out.print(y + " ");
		int[] result = selectionSort(sampleArray);
		//creating an enhanced for loop to print the values in sorted order
		System.out.println("\n---------------------------------------------------------");
		System.out.println("Array after sorting is: ");
		for(int z: result)
			System.out.print(z + " ");
	}

	//method to sort the Array using selectionSort
	public static int[] selectionSort(int[] arr) {
		int n;
		n = arr.length;
		for(int i = 0; i < n; i++) {
			int minIndex = i;
			for(int j = i; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
}
