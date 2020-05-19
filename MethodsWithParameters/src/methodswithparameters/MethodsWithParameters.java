package methodswithparameters;
import java.util.Scanner;
public class MethodsWithParameters {

    public static void main(String[] args) {
        Scanner nicky = new Scanner(System.in);
        String myName;
        int myAge;
        Apples apples = new Apples();
        Lemons lemons = new Lemons();
        
        System.out.println("What is Your Name: ");
        myName = nicky.nextLine();
        System.out.println("What is Your Age: ");
        myAge = nicky.nextInt();
        
        apples.printName(myName);
        lemons.printAge(myAge);
        
        
    }

}
