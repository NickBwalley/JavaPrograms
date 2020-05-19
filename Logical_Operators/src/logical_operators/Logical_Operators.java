package logical_operators;
import java.util.Scanner;
public class Logical_Operators {

    public static void main(String[] args) {
        Scanner nicky = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first-Persons Age: ");
        num1 = nicky.nextInt();
        System.out.println("Enter second-Persons Age: ");
        num2 = nicky.nextInt();
        
        if(num1 < 18 && num2 < 18){
            System.out.println("You Are Eligible to Join this Party!");
        }else{
            System.out.println("Your are Still Kids!!.. Go Back to School and Learn!!");
        }
    }

}
