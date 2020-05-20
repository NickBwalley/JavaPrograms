package arrays;
import java.util.Scanner;
public class NickFury {
	Scanner nicky = new Scanner(System.in);
	//creating variables 
	int total = 0;
	//creating an array
	int rikki[] = new int[5];
	
	//creating method for user input to our array
	public void addNumber() {
		for(int x=0; x<rikki.length; x++) {
			System.out.println("Enter Your Number: ");
			rikki = nicky.nextInt();			
		}
		
	}
}
