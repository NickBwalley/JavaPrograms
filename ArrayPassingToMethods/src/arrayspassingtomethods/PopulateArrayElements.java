package arrayspassingtomethods;
import java.util.Scanner;

public class PopulateArrayElements {
	
	private static int counter = 1;
	Scanner input = new Scanner(System.in);
	int nick[] = new int[5];
	//method to populate an array
	public void passArray() {
		for (int i = 0; i < nick.length; i++) {
			System.out.println("Enter Element " + counter + ": " );
			nick[i] = input.nextInt();
			counter ++;
		}
		System.out.println("This are the Elements inside Your array: ");
		for (int z = 0; z < nick.length; z++) {
			System.out.println(nick[z]);
		}
	}
}
/*
 * An argument is the instance passed to the method during runtime. The term parameter refers to any 
 * declaration within the parentheses following the method/function name in a method/function 
 * declaration or definition; the term argument refers to any expression within the parentheses 
 * of a method/function call.
 */

/*
 * When a parameter is passed to the method, it is called an argument. 
*/
 