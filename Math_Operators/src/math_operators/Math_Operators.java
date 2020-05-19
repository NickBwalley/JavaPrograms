package math_operators;
import java.util.Scanner;
public class Math_Operators {
    public static void main(String[] args) {
       //Mathematical Operators 
       Scanner nicky = new Scanner(System.in);
       int num1, num2, result;
        System.out.println("Enter First Number: ");
       num1 = nicky.nextInt();
        System.out.println("Enter Second Number: ");
       num2 = nicky.nextInt();
       result = num1%num2;//using the modulus Operator 
       result = num1/num2;//using the division Operator
       result = num1+num2;//using the Addition Operator
       result = num1-num2;//using the Subtract Operator
        System.out.println("Result is: "+result);
    }
    
}
