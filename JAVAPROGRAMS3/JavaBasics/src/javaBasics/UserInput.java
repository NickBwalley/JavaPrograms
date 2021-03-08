package javaBasics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an Integer: ");
//		int integer_number = input.nextInt();
//		System.out.println("Your Favorite Number is: " + integer_number);
//		System.out.println("Enter a Float: ");
//		float float_number = input.nextFloat();
//		System.out.println("Float Number: " + float_number);
//		System.out.println("Enter a Double: ");
//		double double_number = input.nextDouble();
//		System.out.println("Double Number: " + double_number);
//		System.out.println("Enter some String: ");
//		String some_string = input.nextLine();
//		System.out.println(some_string);
		System.out.println("What is your Name: ");
		String my_name = input.nextLine();
		System.out.println("Your name is: " +my_name);

	}

}
