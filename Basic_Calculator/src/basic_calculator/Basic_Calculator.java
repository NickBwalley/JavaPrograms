
package basic_calculator;

import java.util.Scanner;
public class Basic_Calculator {

    public static void main(String[] args) {
        Scanner nick = new Scanner(System.in);
        double Num1, Num2, Result;
        System.out.println("Enter First Number: ");
        Num1 = nick.nextDouble();
        System.out.println("Enter Second Number: ");
        Num2 = nick.nextDouble();
        
        Result =  Num1 + Num2;
        System.out.println("Result = "+Result);
    }
    
}
