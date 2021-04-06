package nestedIfStatements;

public class MainClass {

	public static void main(String[] args) {
		int age;
		age = 67;
		
		if(age < 50) {
			System.out.println("You are still Young!");
		}else {
			System.out.println("You are old!");
			if(age < 75) {
				System.out.println("Don't worry you are not REALLY THAT OLD!");
			}else {
				System.out.println("Your time is almost up!");
			}
		}
	}

}
