package methods_with_Param;
import java.util.Scanner;
public class customFunction {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		myName nickyObj = new myName();
		String name;
		System.out.println("What is your Name: ");
		name = nicky.nextLine();
		nickyObj.setName(name);
	}

}
