package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nick = {999,491,635,797,644,323,293,966,1494,1233,1999,1697};
        System.out.println("The Unsorted Aray was: ");
        for(int y: nick)
            System.out.printf("%s ", y);
        System.out.println("\n---------------------------------------------------------");
           
        int[] biiy = bubbleSort(nick);
        System.out.println("The Sorted Array is: ");
        //creating an enhanced forloop to print out the sorted array
        for(int z: biiy)
            System.out.printf("%s ", z);
        
        System.out.println("");
    }
    
    //method to sort an array using bubble sort
    public static int[] bubbleSort(int[] arr){
        int n;
        n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-1); j++){
                if(arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                          
                }
            }
        }
        return arr;
    }

}
