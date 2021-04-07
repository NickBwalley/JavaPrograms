package arraysSystemInputOutput;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter First Number: ");
		array[0] = input.nextInt();
		System.out.println("Enter Second Number: ");
		array[1] = input.nextInt();
		System.out.println("Enter Third Number: ");
		array[2] = input.nextInt();
		System.out.println("Enter Fourth Number: ");
		array[3] = input.nextInt();
		System.out.println("Enter Fifth Number: ");
		array[4] = input.nextInt();
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(i + "\t" + array[i]);
		}
		
		input.close();
	}

}
