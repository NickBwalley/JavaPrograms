package ifStatement;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner rikki = new Scanner(System.in);
		int mark;
		System.out.println("Enter your Mark: ");
		mark = rikki.nextInt();
		if(mark < 50) {
			System.out.println("Hey You have failed your Exam!.. You therefore have not qualified!");
		}else {
			System.out.println("Wow! Splendid! You have passed therefore you are qualified!");
		}
		rikki.close();
	}

}
