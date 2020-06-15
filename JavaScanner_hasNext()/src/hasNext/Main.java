package hasNext;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		hasNext();		
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
		
	}
	

}
