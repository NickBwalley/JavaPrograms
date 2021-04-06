package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		MainBank one = new Bank_A();
		MainBank two = new Bank_B();
		MainBank three = new Bank_C();
		
		System.out.println(one.getInterestRate());
		System.out.println(two.getInterestRate());
		System.out.println(three.getInterestRate());
	}

}
/*Polymorphism: is the ability of an object to take different forms*/