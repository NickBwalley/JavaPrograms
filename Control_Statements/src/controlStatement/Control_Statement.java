package controlStatement;
import java.util.Scanner;
public class Control_Statement {

	public static void main(String[] args) {
		//ifStatement();
		ternaryOperator();
	}
	
	public static void ifStatement() {
		Scanner nicky = new Scanner(System.in);
		int age; 
		System.out.println("What is Your Age: ");
		age = nicky.nextInt();
		if(age < 18)
			System.out.println("Your are a child\n Go Back to School and Learn!..");
		else
			System.out.println("You are fit to have an Id");
	}
	
	//using the ternary operator 
	public static void ternaryOperator() { 
		Scanner nicky = new Scanner(System.in);
		int age1;
		String output;
		System.out.println("Enter Your Age: ");
		age1 = nicky.nextInt();
		
		output = ((age1%2 == 0)?"Even Age":"Odd Age");
		System.out.println(output);
	}
/*
 * RELATED CONCEPTS
 * 1. IF-ELSE Statement
 * 2. NESTED-IF (an if inside another if)
 * 3. SWITCH Statement
 * 4. FOR-LOOP / ENHANCED FOR-LOOP/ FOR-EACH-LOOP
 * 5. WHILE-LOOP
 * 6. DO-WHILE-LOOP
 * 7. BREAK STATEMENTS
 * 8. CONTINUE-STATEMENTS
 * 9. COMMENTS */
}
