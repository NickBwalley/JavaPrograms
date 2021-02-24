package if_Statement2;
//concept you need to understand is how to use the logical or and and logical and
import java.util.Scanner;
public class if_Statement2 {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int age1, age2;
		System.out.println("Enter Boys age: ");
		age1 = nicky.nextInt();
		System.out.println("Enter Girls age: ");
		age2 = nicky.nextInt();
		
		if(age1 >= 18 && age2 >= 18) {
			System.out.println("Wow you are now welcome to BeersPoint!");
		}else {
			System.out.println("You are still Kids Go back to School and Learn!!");
		}
	}	

}
