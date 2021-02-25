package elseIf_Statement;
import java.util.Scanner;
public class elseIf {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Enter Your Name: ");
		name = nicky.nextLine();
		System.out.println("Enter Your Age: ");
		age = nicky.nextInt();
		
		if(age >=75)
			System.out.println("You are Really Old!");
		else if(age <75 && age >= 60)
			System.out.println("Your are Just Old!");
		else if(age >=35 && age <= 50)
			System.out.println("You can drive a Tractor!");
		else if(age >=21 && age < 35)
			System.out.println("You can drive a Nissan!");
		else if(age >= 18)
			System.out.println("You are fit to have an ID!");
		else
			System.out.println("Your Just a Kid...Go Back To Schoo!");
		nicky.close();
	}

}
