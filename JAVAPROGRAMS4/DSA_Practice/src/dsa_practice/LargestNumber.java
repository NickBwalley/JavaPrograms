package dsa_practice;
import java.util.Scanner;
public class LargestNumber {
    Scanner nicky = new Scanner(System.in);
    int max, n;
    
    public void printArray(){
        System.out.println("Enter Size of the Array:");
        n = nicky.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter Elements of the Array: ");
        for(int x=0; x<n; x++){
            a[x] = nicky.nextInt();
        }
        //qry to print out largest Element of the Array
        max = a[0];
        for(int y=0; y<n; y++){
            if(a[0] < a[y]){
                max = a[y];
            }
        }
        System.out.println("The Largest Number is: " + max);
        
    }

   
    
}
