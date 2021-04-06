package arrays;
import java.util.Scanner;
public class NickFury {
	Scanner nicky = new Scanner(System.in);
	//creating variables 
	int total = 0;
	//creating an array
	int rikki[] = new int[5];
	
	// method for user input to our array
	public void addNumber() {
		for(int x=0; x<rikki.length; x++) {
			System.out.println("Enter Your Number: ");
			rikki[x] = nicky.nextInt();			
		}
		//for loop to hold the variables the user has inputed
		for(int y=0; y<rikki.length; y++) {
			total+=rikki[y];
		}		
	}
	
	//method to return the total of the result 
	public int result() {
		return total;
	}
	
	//method to output the result in the result()
	public void returnResult() {
		System.out.printf("Result of your Numbers are: %d", result());
	}
}
