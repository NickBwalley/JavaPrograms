package inheritanceConcepts;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.barks();
		d.sound();
		System.out.println("***********");
		Cat c = new Cat();
		c.meow();
		c.barks();
		c.sound();
	}
	

}
