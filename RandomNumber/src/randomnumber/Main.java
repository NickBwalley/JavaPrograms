package randomnumber;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		int rand_number = (int) (Math.random()*101);
		System.out.println(rand_number);
		System.out.println();
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
