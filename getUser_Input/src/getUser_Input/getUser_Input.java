package getUser_Input;

import java.util.Scanner;
public class getUser_Input {
	public static void main(String [] args) {
		Scanner nicky = new Scanner(System.in);
		System.out.println("Your name is: " + nicky.nextLine());
		nicky.close();
	}
}
