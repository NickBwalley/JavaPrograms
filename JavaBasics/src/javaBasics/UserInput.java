package javaBasics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your favorite number: ");
		int favorite_number = input.nextInt();
		System.out.println("Your Favorite Number is: " + favorite_number);
		

	}

}
