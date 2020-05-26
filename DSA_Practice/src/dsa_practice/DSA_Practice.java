package dsa_practice;
import java.util.Scanner;
public class DSA_Practice {

    public static void main(String[] args) {
    String daysOfWeeks [] = new String[7];
    daysOfWeeks[0] = "Monday";
    daysOfWeeks[1] = "Tuesday";
    daysOfWeeks[2] = "Wednesday";
    daysOfWeeks[3] = "Thurday";
    daysOfWeeks[4] = "Friday";
    daysOfWeeks[5] = "Saturday";
    daysOfWeeks[6] = "Sunday";
    
    for(int i = 0; i < daysOfWeeks.length; i++){
        System.out.println(daysOfWeeks[i]);
    }
    
    //LargestNumber maximum = new LargestNumber();
    //maximum.printArray();
    //printArray();
        System.out.println(checkElement());
    
   }
    
    public static void printArray(){
        Scanner nicky = new Scanner(System.in);
        int max, n;
        System.out.println("Enter size of the Array: ");
        n = nicky.nextInt();
        int a[] = new int[n];
        //looping through the array populating the array
        for(int i=0; i<n; i++){
            System.out.println("Enter Elements of the Array: ");
            a[i] = nicky.nextInt();
        }
        //printing the largest Element  of the Array
        max = a[0];
        for(int z=0; z< a.length; z++){
            if(max < a[z]){
                max = a[z];
            }
        }
        System.out.println("The largest Element of the Array is: "+max);
    }
    
    public static boolean checkElement(){
        int s, check;
        Scanner nicky = new Scanner(System.in);
        int array[] = {14,19,21,29,39,77,79,99};        
        System.out.println("Search Number: ");
        s = nicky.nextInt();
        //creating an enhanced for loop
        for(int z: array){
            if( s == z){
             return true;
            }
            }
            return false;    
        }
    

}
