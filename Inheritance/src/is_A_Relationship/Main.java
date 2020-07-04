package is_A_Relationship;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		// Using the instance operator to check if an object is an instance of a class( Returns Boolean )
		System.out.println(d instanceof Animal);	// Returns True
		System.out.println(c instanceof Animal);	// Returns True
		System.out.println(a instanceof Dog);	// Returns false
	}

}
