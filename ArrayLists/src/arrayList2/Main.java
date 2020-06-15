package arrayList2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		classArrayList();
	}

	//array list 
	public static void classArrayList() {
		Scanner nicky = new Scanner(System.in);
		ArrayList<String> DBIT = new ArrayList<String>();
		String stdNo;
		char quit = 'Y';
		
		while(quit == 'Y') {
			System.out.println("Enter Your Student-Number: ");
			stdNo = nicky.next();
			
			DBIT.add(stdNo);
			
			System.out.println("Do You Want to Enter another Record? Y/N");
			String word;
			word = nicky.next();
			word = word.toUpperCase();
			quit = word.charAt(0);
		}
		
		System.out.println("The RECORDS ARE: ");
		for(String z: DBIT)
			System.out.println(z);
		
		
		
	}
}
