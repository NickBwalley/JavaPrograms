package arraysGetSystemInput;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter First Number: ");
		array[0] = nicky.nextInt();
		System.out.println("Enter Second Number: ");
		array[1] = nicky.nextInt();
		System.out.println("Enter Third Number: ");
		array[2] = nicky.nextInt();
		System.out.println("Enter Fourth Number: ");
		array[3] = nicky.nextInt();
		System.out.println("Enter Fifth Number: ");
		array[4] = nicky.nextInt();
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}
		
		
	}

}
