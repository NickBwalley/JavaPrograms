package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] sampleArray = {991,349,244,576,871,561,845};
        //enhanced for loop to print out the values before array being sorted
        System.out.println("Array before sorting: ");
        for(int y: sampleArray)
            System.out.printf("%s , ", y);
        int[] result = selectionSort(sampleArray);
        
        //creating a forloop to print out the values after being sorted 
        System.out.println("\n--------------------------------------");
        System.out.println("Array after being sorted is: ");
        for(int z: result)
            System.out.printf("%s , ", z);
        System.out.println("\n--------------------------------------");
        System.out.println("The Maximum Element inside the Array is: ");
        System.out.println(maximumElement(sampleArray));
        
    }
    //method to print out the maximum element inside our array
    public static int maximumElement(int[] nick){
       int n = nick.length;
       int max = nick[0];
       for(int i = 0; i < n; i++){
           if(nick[i] > max){
               max = nick[i];
           }
       }
       return max;
       
    }
    //method to sort an array using SelectionSort
    public static int[] selectionSort(int[] arr){
        int n;
        n = arr.length;
        for(int i = 0; i < n; i++){
            int minIndex = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp;
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        return arr;
    }
 
}
