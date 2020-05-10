package switch_Statement;
import java.util.Scanner;
public class switchStatement {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int age;
		System.out.println("What is your Age: ");
		age = nicky.nextInt();
		
		switch(age) {
		case 18:
			System.out.println("You are qualified to have an ID!");
			break;
		case 19:
			System.out.println("You are qualified to have a Driving Licence!");
			break;
		case 20:
			System.out.println("Go and marry and start a family!");
			break;
		case 21:
			System.out.println("You are qualified to go to the KENYA-ARMY!");
			break;
		default:
			System.out.println("You are either too young or too old to play this game!");
				
		}
		
	}

}
