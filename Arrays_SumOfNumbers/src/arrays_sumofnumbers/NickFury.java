package arrays_sumofnumbers;
import java.util.Scanner;

public class NickFury {
    Scanner nicky = new Scanner(System.in);
    //creating our varibles
    int total = 0;
    //creating an array
    int nick[] = new int[5];
    
    //creating a method for user input in the array
    public void fillArray(){
        for(int x=0; x<nick.length; x++){
            System.out.println("Enter Number: ");
            nick[x] = nicky.nextInt();
        }
        //creating a for loop to hold those values
        for(int y=0; y<nick.length; y++){
            total += nick[y];
        }
        
    }

    //creating a method to return our sum
    public int returnTotal(){
        return total;
    }
    //create another method to print the value
    public void printCrap(){
        System.out.printf("Result of Array is: %d", returnTotal());
        System.out.println("");
    }
    
}
