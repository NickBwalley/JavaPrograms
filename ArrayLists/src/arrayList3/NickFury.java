package arrayList3;
import java.util.Scanner;
import java.util.ArrayList;

public class NickFury {
	public void basketBall() {
		Scanner nicky = new Scanner(System.in);
		ArrayList<String> players = new ArrayList<String>();
		String name; 
		String age;
		String points;
		char quit = 'Y'; //terminator character;
		
		while(quit == 'Y') {
			System.out.println("Enter Players Name: ");
			name = nicky.next();
			System.out.println("Enter Players Age: ");
			age = nicky.next();
			System.out.println("Enter Players all-Time points: ");
			points = nicky.next();
			
			
		}
		
	}
}
