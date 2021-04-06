package elseIfStatement;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Enter Your Name: ");
		name = input.nextLine();
		System.out.println("Enter Your Age: ");
		age = input.nextInt();
		
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
		input.close();
		
		ternaryOperator();
	}
	
	public static void ternaryOperator() {
		// Short Hand If...Else (Ternary Operator)
		int time = 18;
		String result = (time > 20) ? "GoodNight" : "GoodEvening";
		System.out.println(result);
	}

}
/*
 * Java supports the usual logical conditions from mathematics:

	Less than: a < b
	Less than or equal to: a <= b
	Greater than: a > b
	Greater than or equal to: a >= b
	Equal to a == b
	Not Equal to: a != b
	You can use these conditions to perform different actions for different decisions.

	Java has the following conditional statements:

	Use if to specify a block of code to be executed, if a specified condition is true
	Use else to specify a block of code to be executed, if the same condition is false
	Use else if to specify a new condition to test, if the first condition is false
	Use switch to specify many alternative blocks of code to be executed
*/
