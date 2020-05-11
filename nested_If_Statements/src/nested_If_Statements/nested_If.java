package nested_If_Statements;

public class nested_If {

	public static void main(String[] args) {
		int age;
		age = 90;
		
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
