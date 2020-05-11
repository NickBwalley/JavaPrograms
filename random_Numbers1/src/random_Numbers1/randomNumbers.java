package random_Numbers1;
import java.util.Random;
public class randomNumbers {

	public static void main(String[] args) {
		Random nicky = new Random();
		int number;
		for(int i=0; i<5; i++) {
			number = 1+nicky.nextInt(6);
			System.out.println(number);
		}
	}

}
