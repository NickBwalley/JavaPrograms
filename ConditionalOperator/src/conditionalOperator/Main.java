package conditionalOperator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner input = new Scanner(System.in);
		int age;
		age = input.nextInt();
		System.out.println(age > 50 ? "Your are old!" : "You are young");
		input.close();
	}
}
