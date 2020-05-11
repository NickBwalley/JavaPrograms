import java.util.Scanner;
public class arraySum {

	public static void main(String[] args) {
		Scanner nicky = new Scanner(System.in);
		int rikki[] = new int[5];
		int total = 0;
		System.out.println("Enter First Number: ");
		rikki[0] = nicky.nextInt();
		System.out.println("Enter Second Number: ");
		rikki[1] = nicky.nextInt();
		System.out.println("Enter Third Number: ");
		rikki[2] = nicky.nextInt();
		System.out.println("Enter Fourth Number: ");
		rikki[3] = nicky.nextInt();
		System.out.println("Enter Fifth Number: ");
		rikki[4] = nicky.nextInt();
		
		System.out.println("Index\tValue");
		
		for(int i = 0; i < rikki.length; i++ ) {
			total+=rikki[i];
			System.out.println(i + "\t" + rikki[i]);
		}
		
		System.out.println("The total is: "+total);
	}

}
