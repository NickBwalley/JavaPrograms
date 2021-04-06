package inheritanceConcepts;

public class MainClass {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.barks();
		d.sound();
		System.out.println("***********");
		Cat c = new Cat();
		c.meow();
		c.barks();
		c.sound();
		System.out.println("***********");
		
	}
	
	/*TYPES OF INHERITANCE 
	 * 1. Single Inheritance 
	 * 2. MultiLevel Inheritance 
	 * 3. Hierarchial Inheritance 
	 * 4. Multiple Inheritance (Java Does not support Multiple Inheritance)
	 *  Since java does not allow to have Multiple Inheritance because it is ambiguous(Not Clear)
	 *  You can have interfaces instead
	 * */
}
