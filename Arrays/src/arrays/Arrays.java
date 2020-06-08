package arrays;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        printDaysOfWeek();
        largestNumber();
    }
    //method to print out days of week using array
    public static void printDaysOfWeek(){
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Days Of The Week are:");
        for(String A: days){
            System.out.println(A);
        }
        System.out.println("------------------------");
    }
    //method to determine the largest Element in an array
    public static void largestNumber(){
        Scanner nicky = new Scanner(System.in);
        int n, max;
        System.out.println("Enter Size of Your Array: ");
        n = nicky.nextInt();
        int Array[] = new int[n];
        System.out.println("Enter the Elements of Your Array: ");
        for(int i = 0; i < n; i++){
            Array[i] = nicky.nextInt();
        }
        //determining the maximum number inside our array
        max = Array[0];
        for(int z = 0; z < n; z++){
            if(max < Array[z]){
                max = Array[z];
            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Largest Number inside our Array is: " + max);
    }

}
