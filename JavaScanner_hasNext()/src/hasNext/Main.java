package hasNext;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//hasNext();
		checkHasNext();
	}
	
	public static void hasNext() {
		String myName = "";
		Scanner nicky = new Scanner(myName);
		boolean stmt;
		stmt = nicky.hasNext();
		System.out.println(stmt);//returns true or false
		nicky.close();
	}
	
	public static void checkHasNext() {
		String bestLanguage = "My Best Language is JAVA!..";
		char language;
		bestLanguage = bestLanguage.toLowerCase();
		bestLanguage = bestLanguage.toUpperCase();
		Scanner nicky = new Scanner(bestLanguage);
		System.out.println("Result Before: " + nicky.hasNext());
		System.out.println(nicky.nextLine());
		System.out.println("Result After: " + nicky.hasNext());
	}
	

}
