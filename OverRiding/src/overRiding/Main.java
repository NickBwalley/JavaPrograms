package overRiding;

public class Main {

	public static void main(String[] args) {
		//Animal a = new Animal();
		Animal d = new Dog();
		
		//a.move();
		
		d.move();
		d.barks();
	}

}
/*OVERRIDING RULES:
 * When you override a method from base class it needs to have the same number of arguments and return type
 * When you override a method from base class it must have the same access modifier as it is in the base class
 * *
 */