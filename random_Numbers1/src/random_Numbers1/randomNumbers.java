package random_Numbers1;
import java.util.Random;
public class randomNumbers {

	public static void main(String[] args) {
		generateRandNum();
	}
	
	public static void generateRandNum() {
		Random dice = new Random();
		int number;
		for(int i = 0; i < 5; i++) {
			number = 1+dice.nextInt(10);
			System.out.println(number);
		}
	}

}
