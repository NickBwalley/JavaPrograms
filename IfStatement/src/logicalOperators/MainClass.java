package logicalOperators;
//concept you need to understand is how to use the logical or and and logical and
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		//logicalAnd();
		logicalOr();
	}
	
	public static void logicalAnd() {
		Scanner input = new Scanner(System.in);
		int age, age1;		
		System.out.println("Enter Your Boys age: ");
		age = input.nextInt();
		System.out.println("Enter Your Girls age: ");
		age1 = input.nextInt();
		
		if(age >= 18 && age1 >= 18)
			System.out.println("Welcome to this Club! ");
		else
			System.out.println("Still Kids go back to School!");
		input.close();
	}
	public static void logicalOr() {
		Scanner nicky = new Scanner(System.in);
		int age, age1;		
		System.out.println("Enter Your Boys age: ");
		age = nicky.nextInt();
		System.out.println("Enter Your Girls age: ");
		age1 = nicky.nextInt();
		
		if(age >= 18 || age1 >= 18)
			System.out.println("Welcome to this Club! ");
		else
			System.out.println("Still Kids go back to School!");
		nicky.close();
	}

}
