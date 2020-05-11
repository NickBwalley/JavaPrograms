package conditional_Operator;
import java.util.Scanner;
public class conditionalOperator {
	public static void main(String[] args) {
		System.out.println("Enter your age: ");
		Scanner nicky = new Scanner(System.in);
		int age;
		age = nicky.nextInt();
		System.out.println(age > 50 ? "Your are old!" : "You are young");
	}
}
