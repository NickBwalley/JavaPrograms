package arraysPassing;
import java.util.Scanner;

public class Prickler {
	
	private static int counter = 1;
	Scanner scurry = new Scanner(System.in);
	int nick[] = new int[5];
	//method to populate an array
	public void passArray() {
		for (int i = 0; i < nick.length; i++) {
			System.out.println("Enter Element " + counter + ": " );
			nick[i] = scurry.nextInt();
			counter ++;
		}
		System.out.println("This are the Elements inside Your array: ");
		for (int z = 0; z < nick.length; z++) {
			System.out.println(nick[z]);
		}
	}
}
