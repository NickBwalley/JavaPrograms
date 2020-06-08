package arrays;
import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
        //printDaysOfWeek();
        //largestNumber();
        //System.out.println(checkElement());
        //sumOfArray();
        //evenNumbers();
        print2DArray();
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
    
    //method to check if an element exists inside our Array:
    public static boolean checkElement(){
        Scanner check = new Scanner(System.in);
        int number;
        int nicky[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Enter Element To Search: ");
        number = check.nextInt();
        for(int i = 0; i < nicky.length; i++){
            if(number == nicky[i]){
                return true;
            }
        }
        return false;
    }
    
    //creating a sentinel controlled program to compute the sum of elements inside our array
    public static void sumOfArray(){
        Scanner sentinel  =  new Scanner(System.in);
        int num;
        int total = 0;
        int Elements = 0;
        
        System.out.println("Enter Your Numbers (Press -1 to QUIT): ");
        num = sentinel.nextInt();
        while(num != -1){
            total += num;
            num = sentinel.nextInt();
            Elements++;
        }
        System.out.println("Total = " + total);
        System.out.println("Elements Entered are: "+ Elements);
    }
    
    //method to print out the Even numbers inside our array
    public static void evenNumbers(){
        Scanner even = new Scanner(System.in);
        int number;
        System.out.println("Declare Size of Your Array: ");
        number = even.nextInt();
        int nicky[] = new int[number];
        System.out.println("Enter the Elements of Your Array: ");
        for(int y = 0; y < number; y++){
            nicky[y] = even.nextInt();
        }
        //for-loop to loop inside our array and check if there are elements which are even
        System.out.println("Even Numbers are: ");
        for(int a = 0; a < nicky.length; a++){
            
            if(nicky[a]%2 == 0){                
                System.out.println(nicky[a]);
            }
        }
        
    }
    
    public static void print2DArray(){
        int Aicy[][] = {{2,3,4},{5,6,7},{8,9,10},{11,12,13}};
        System.out.println("Elements inside Your Array is: ");
        for(int row = 0; row < Aicy.length; row++){
            for(int column = 0; column < Aicy[row].length; column++){
                System.out.print(Aicy[row][column]+ "\t");
            }
            System.out.println("");
        }
        
    }

}
