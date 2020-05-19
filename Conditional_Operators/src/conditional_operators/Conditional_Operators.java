package conditional_operators;
import java.util.Scanner;
public class Conditional_Operators {

    public static void main(String[] args) {
    Scanner nicky = new Scanner(System.in);
    int age;
        System.out.println("Enter Your Age: ");
        age = nicky.nextInt();
        //instead of adding an ifStatement you just need this conditional Operator 
        //decision for your output or your results...
        System.out.println(age < 18 ? "You are Still a Kid!" : "You are an Adult!");
    }

}
