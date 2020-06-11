package methodsAndConstructors;

public class Apples {
	private int sum = 0;
	private int a; 
	private int b;
	
	//constructor to sum two numbers 
	public Apples() {
		a = 35;
		b = 35;
		sum = a+b;
		
		System.out.println("The Sum of: "+ a + "+"+ b + " = "+sum);
	}

	//creating a method to add two numbers 
	public int sumTwoNumbers() {
		int x, y;
		int sum;
		x = 35;
		y = 35;
		sum = x + y;
		
		return sum;
	}

}
