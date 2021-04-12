package arraylist2;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLists {
	//array list to hold names of artists and their songs 
	public ArrayLists() {
		Scanner nicky = new Scanner(System.in);
		ArrayList<String> records = new ArrayList<String>();
		 		
		String firstName;
		String lastName;
		String stdNo;
		String concat;
		char quit = 'Y';
		
		while(quit == 'Y') {
			System.out.println("Enter Students FirstName: ");
			firstName = nicky.next();
			System.out.println("Enter Students LastName: ");
			lastName = nicky.next();
			System.out.println("Enter Your Students Number: ");
			stdNo = nicky.next();
			concat = "----------------------------------------";
			//add records inside our ArrayList
			records.add(firstName);
			records.add(lastName);
			records.add(stdNo);
			records.add(concat);
			
			String word;
			System.out.println("ADD ANOTHER RECORD? Y/N: ");
			word = nicky.next();
			word = word.toUpperCase();
			quit = word.charAt(0);
			
		}
		
		System.out.println("STUDENTS RECORD ARE AS FOLLOWS: ");
		for(String z: records)
			System.out.println(z);
		
	}
}
