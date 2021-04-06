package whileLoop;

public class MainClass {

	public static void main(String[] args) {
		int counter = 0;
		while (counter < 10) {
			System.out.println(counter);
			counter ++; // Note: Do not forget to increase the variable used in the condition, 
							//otherwise the loop will never end!
		}
	}

}
