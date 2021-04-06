package getUserInput;

import java.util.Scanner;
public class MainClass {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Name: ");
		System.out.println("Your name is: " + input.nextLine());
		input.close();
	}
}
